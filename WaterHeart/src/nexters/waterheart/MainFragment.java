package nexters.waterheart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockFragment;

public class MainFragment extends SherlockFragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.mainview, container,false);
		Button btn = (Button)view.findViewById(R.id.button);
		btn.setOnClickListener(mOnClickListener);
		return view;
	}

	public View.OnClickListener mOnClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Fragment fragment = new HistoryFragment();
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			transaction.add(R.id.layout, fragment);
			transaction.addToBackStack(null);
			transaction.commit();
		}
	};
	
}
