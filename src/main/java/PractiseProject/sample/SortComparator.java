package PractiseProject.sample;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class SortComparator extends WritableComparator{
	
		
	protected SortComparator() {
		super(keyComparator.class, true);
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("rawtypes")
	@Override
	public int compare(WritableComparable a, WritableComparable b) {
		
		keyComparator thisValue = (keyComparator) a ;
		keyComparator thatValue = (keyComparator) b;

		if (thisValue.compareTo(thatValue) != 0) {
			if (thisValue.getState().compareTo(thatValue.getState()) == 0)
				if (thisValue.getCity().compareTo(thatValue.getCity()) == 0)
					if (thisValue.getNeighbourhood().compareTo(thatValue.getNeighbourhood()) == 0)
						return 0;
					else
						return thisValue.getNeighbourhood().compareTo(thatValue.getNeighbourhood());
				else
					return thisValue.getCity().compareTo(thatValue.getCity());
			else
				return thisValue.getState().compareTo(thatValue.getState());

		}

		return 0;
		
	}

}
