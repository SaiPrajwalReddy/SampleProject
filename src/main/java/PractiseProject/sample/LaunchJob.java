package PractiseProject.sample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LaunchJob {

	// private static final org.apache.commons.logging.Log LOG =
	// LogFactory.getLog(LaunchJob.class);

	public int execute(String className, Properties jobProperties) throws IOException {
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";

		StringBuilder classpath = new StringBuilder();

		classpath.append(File.pathSeparatorChar).append("/app_2/mule/lib/user/*").append(File.pathSeparatorChar)
				.append("/app_2/mule/lib/user").append(File.pathSeparatorChar)
				.append("/opt/mapr/hadoop/hadoop-2.7.0/etc/hadoop:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/common/lib/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/common/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/hdfs:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/hdfs/lib/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/hdfs/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/yarn/lib/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/yarn/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/mapreduce/lib/*:/opt/mapr/hadoop/hadoop-2.7.0/share/hadoop/mapreduce/*::/opt/apps/marklogic/mapreduce/lib/commons-modeler-2.0.1.jar:/opt/apps/marklogic/mapreduce/lib/marklogic-mapreduce2-1.1.5.jar:/opt/apps/marklogic/xcc/lib/marklogic-xcc-7.0.4.jar:/opt/apps/marklogic/mapreduce/lib/maprfs*.jar:/opt/apps/marklogic/mapreduce/lib/commons-modeler-2.0.1.jar:/opt/apps/marklogic/mapreduce/lib/marklogic-mapreduce2-1.1.5.jar:/opt/apps/marklogic/xcc/lib/marklogic-xcc-7.0.4.jar:/opt/apps/marklogic/mapreduce/lib/maprfs*.jar:/opt/mapr/hadoop/hadoop-2.7.0/contrib/capacity-scheduler/*.jar:/opt/mapr/lib/kvstore*.jar:/opt/mapr/lib/libprotodefs*.jar:/opt/mapr/lib/baseutils*.jar:/opt/mapr/lib/maprutil*.jar:/opt/mapr/lib/json-1.8.jar:/opt/mapr/lib/flexjson-2.1.jar")
				.append(File.pathSeparatorChar);
		// .append(AccArtifactLoadHelper.getArtifactPath(batchWorkflowName));
		// classpath.append(File.pathSeparatorChar);
		// classpath.append("/app_2/mule/lib/opt/*");

		URLClassLoader urlClassLoader = (URLClassLoader) getClass().getClassLoader();
		URL[] urls = urlClassLoader.getURLs();
		for (URL url : urls) {
			classpath.append(File.pathSeparatorChar);
			classpath.append(url.getFile());
		}

		List<String> commandStrings = new ArrayList<String>();
		commandStrings.add(javaBin);
		commandStrings.add("-Xmx4000m");
		commandStrings.add("-Dlogfile.name=" + "6734" + ".log");
		commandStrings.add("-Djavax.net.ssl.trustStore=/app_2/jdk1.7.0_80/jre/lib/security/cacerts");
		/*
		 * try { BufferedReader jvmFlags = new BufferedReader(new InputStreamReader(
		 * Thread.currentThread().getContextClassLoader().getResourceAsStream(
		 * "childProcessJvmFlags.txt"))); String jvmFlag; while ((jvmFlag =
		 * jvmFlags.readLine()) != null) { if (StringUtils.isNotEmpty(jvmFlag)) {
		 * commandStrings.add(jvmFlag); } } } catch (IOException e) {
		 * 
		 * }
		 */
		commandStrings.add(className);
		String[] command = commandStrings.toArray(new String[0]);
		ProcessBuilder builder = new ProcessBuilder(command);
		builder.inheritIO();

		Map<String, String> environment = builder.environment();

		/*
		 * Place classpath in an environment variable, because passing on the command
		 * line may cause a too many arguments exception for the java executable.
		 */
		environment.put("CLASSPATH", classpath.toString());

		/*
		 * For webservice requests the TARGET_ENV variable will not be explicitly set in
		 * the request or the job.properties. So adding below condition to overwrite the
		 * blank value with environment value
		 */
		jobProperties.setProperty("input.dir",
				"/datalake/optum/optuminsight/analytics_capability/temp/mredd110/input-1/reviews-orig.csv");
		jobProperties.setProperty("output.dir",
				"/datalake/optum/optuminsight/analytics_capability/temp/mredd110/output/testb");
		jobProperties.setProperty("TARGET_ENV", "test");

		for (String key : jobProperties.stringPropertyNames()) {
			environment.put(key, jobProperties.getProperty(key));
		}
		// Set ACC Lib path for Job builder
		/*
		 * environment.put(ACC_LIB_PATH_KEY, System.getProperty(ACC_LIB_PATH_KEY, ""));
		 */

		Process process;
		try {
			process = builder.start();
		} catch (Exception e) {
			// LOG.error("Failed to start process.", e);
			return -1;
		}

		while (true) {
			try {
				int exitCode = process.waitFor();

				BufferedInputStream st = new BufferedInputStream(process.getErrorStream());

				BufferedReader s = new BufferedReader(new InputStreamReader(st));
				String line;
				while ((line = s.readLine()) != null) {
					//System.out.println(line);
				}

				return exitCode;
			} catch (Exception e) {
				// LOG.error("Process waitFor was interrupted.", e);
			}
		}
	}

	public static void main(String args[]) {
		LaunchJob lj = new LaunchJob();
		try {
			int code = lj.execute("PractiseProject.sample.AnalyticClass", new Properties());
			System.out.println("Code is " + code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
