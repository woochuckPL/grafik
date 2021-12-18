package pl.woochuck.grafik;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity 
{
	private List<TextView> hoursTextViewList;
	private List<TextView> employee0hoursTextViewList;
	private List<TextView> employee1hoursTextViewList;
	private List<TextView> employee2hoursTextViewList;
	private List<TextView> employee3hoursTextViewList;
	private List<TextView> employee4hoursTextViewList;
	private List<TextView> employee5hoursTextViewList;
	private List<TextView> employee6hoursTextViewList;
	private List<TextView> employee7hoursTextViewList;
	private List<TextView> employee8hoursTextViewList;
	private List<TextView> employee9hoursTextViewList;
	private List<List<TextView>> employeesHoursTextViewList;
	private List<RadioButton> radioButtonsPushout;
	private List<CheckBox> checkBoxesPresent;
	
	private Employees employees;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		prepareTextViewLists();
		prepareRadioButtonList();
		prepareCheckBoxList();
		
		employees = new Employees();
		
	}
	
	private void prepareTextViewLists()
	{
		hoursTextViewList = new ArrayList<>();
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour0));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour1));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour2));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour3));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour4));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour5));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour6));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour7));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour8));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour9));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour10));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour11));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour12));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour13));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour14));
		hoursTextViewList.add((TextView)findViewById(R.id.txtHour15));
		
		employee0hoursTextViewList = new ArrayList<>();
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H0));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H1));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H2));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H3));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H4));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H5));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H6));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H7));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H8));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H9));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H10));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H11));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H12));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H13));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H14));
		employee0hoursTextViewList.add((TextView)findViewById(R.id.txtE0H15));
		
		employee1hoursTextViewList = new ArrayList<>();
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H0));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H1));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H2));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H3));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H4));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H5));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H6));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H7));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H8));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H9));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H10));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H11));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H12));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H13));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H14));
		employee1hoursTextViewList.add((TextView)findViewById(R.id.txtE1H15));
		
		employee2hoursTextViewList = new ArrayList<>();
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H0));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H1));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H2));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H3));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H4));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H5));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H6));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H7));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H8));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H9));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H10));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H11));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H12));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H13));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H14));
		employee2hoursTextViewList.add((TextView)findViewById(R.id.txtE2H15));

		employee3hoursTextViewList = new ArrayList<>();
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H0));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H1));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H2));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H3));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H4));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H5));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H6));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H7));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H8));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H9));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H10));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H11));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H12));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H13));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H14));
		employee3hoursTextViewList.add((TextView)findViewById(R.id.txtE3H15));
		
		employee4hoursTextViewList = new ArrayList<>();
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H0));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H1));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H2));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H3));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H4));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H5));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H6));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H7));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H8));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H9));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H10));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H11));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H12));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H13));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H14));
		employee4hoursTextViewList.add((TextView)findViewById(R.id.txtE4H15));

		employee5hoursTextViewList = new ArrayList<>();
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H0));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H1));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H2));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H3));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H4));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H5));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H6));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H7));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H8));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H9));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H10));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H11));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H12));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H13));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H14));
		employee5hoursTextViewList.add((TextView)findViewById(R.id.txtE5H15));

		employee6hoursTextViewList = new ArrayList<>();
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H0));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H1));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H2));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H3));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H4));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H5));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H6));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H7));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H8));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H9));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H10));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H11));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H12));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H13));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H14));
		employee6hoursTextViewList.add((TextView)findViewById(R.id.txtE6H15));

		employee7hoursTextViewList = new ArrayList<>();
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H0));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H1));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H2));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H3));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H4));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H5));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H6));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H7));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H8));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H9));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H10));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H11));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H12));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H13));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H14));
		employee7hoursTextViewList.add((TextView)findViewById(R.id.txtE7H15));
		
		employee8hoursTextViewList = new ArrayList<>();
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H0));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H1));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H2));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H3));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H4));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H5));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H6));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H7));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H8));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H9));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H10));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H11));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H12));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H13));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H14));
		employee8hoursTextViewList.add((TextView)findViewById(R.id.txtE8H15));

		employee9hoursTextViewList = new ArrayList<>();
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H0));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H1));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H2));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H3));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H4));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H5));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H6));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H7));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H8));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H9));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H10));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H11));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H12));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H13));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H14));
		employee9hoursTextViewList.add((TextView)findViewById(R.id.txtE9H15));
		
		employeesHoursTextViewList = new ArrayList<>();
		employeesHoursTextViewList.add(employee0hoursTextViewList);
		employeesHoursTextViewList.add(employee1hoursTextViewList);
		employeesHoursTextViewList.add(employee2hoursTextViewList);
		employeesHoursTextViewList.add(employee3hoursTextViewList);
		employeesHoursTextViewList.add(employee4hoursTextViewList);
		employeesHoursTextViewList.add(employee5hoursTextViewList);
		employeesHoursTextViewList.add(employee6hoursTextViewList);
		employeesHoursTextViewList.add(employee7hoursTextViewList);
		employeesHoursTextViewList.add(employee8hoursTextViewList);
		employeesHoursTextViewList.add(employee9hoursTextViewList);
	}
	
	private void prepareRadioButtonList()
	{
		radioButtonsPushout = new ArrayList<>();
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee0));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee1));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee2));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee3));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee4));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee5));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee6));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee7));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee8));
		radioButtonsPushout.add((RadioButton)findViewById(R.id.radioPushoutEmployee9));
	}
	
	private void prepareCheckBoxList()
	{
		checkBoxesPresent = new ArrayList<>();
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee0));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee1));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee2));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee3));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee4));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee5));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee6));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee7));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee8));
		checkBoxesPresent.add((CheckBox)findViewById(R.id.checkEmployee9));
	}
	
	public void onClickRadioButtonPushout(View view)
	{
		for (int i = 0; i < radioButtonsPushout.size(); i++) {
			if (((RadioButton) view) == radioButtonsPushout.get(i)) {
				radioButtonsPushout.get(i).setChecked(true);
			} else {
				radioButtonsPushout.get(i).setChecked(false);
			}
		}
	}
	
	private void setShift()
	{
		Spinner shiftSpinner = (Spinner) findViewById(R.id.shiftSpinner);
		int shift = (int) shiftSpinner.getSelectedItemId();
		
		switch (shift) {
			case 0:
				hoursTextViewList.get(0).setText("06:00");
				hoursTextViewList.get(1).setText("06:30");
				hoursTextViewList.get(2).setText("07:00");
				hoursTextViewList.get(3).setText("07:30");
				hoursTextViewList.get(4).setText("08:00");
				hoursTextViewList.get(5).setText("08:30");
				hoursTextViewList.get(6).setText("09:00");
				hoursTextViewList.get(7).setText("09:30");
				hoursTextViewList.get(8).setText("10:00");
				hoursTextViewList.get(9).setText("10:30");
				hoursTextViewList.get(10).setText("11:00");
				hoursTextViewList.get(11).setText("11:30");
				hoursTextViewList.get(12).setText("12:00");
				hoursTextViewList.get(13).setText("12:30");
				hoursTextViewList.get(14).setText("13:00");
				hoursTextViewList.get(15).setText("13:30");
				break;
			case 1:
				hoursTextViewList.get(0).setText("14:00");
				hoursTextViewList.get(1).setText("14:30");
				hoursTextViewList.get(2).setText("15:00");
				hoursTextViewList.get(3).setText("15:30");
				hoursTextViewList.get(4).setText("16:00");
				hoursTextViewList.get(5).setText("16:30");
				hoursTextViewList.get(6).setText("17:00");
				hoursTextViewList.get(7).setText("17:30");
				hoursTextViewList.get(8).setText("18:00");
				hoursTextViewList.get(9).setText("18:30");
				hoursTextViewList.get(10).setText("19:00");
				hoursTextViewList.get(11).setText("19:30");
				hoursTextViewList.get(12).setText("20:00");
				hoursTextViewList.get(13).setText("20:30");
				hoursTextViewList.get(14).setText("21:00");
				hoursTextViewList.get(15).setText("21:30");
				break;
			case 2:
				hoursTextViewList.get(0).setText("22:00");
				hoursTextViewList.get(1).setText("22:30");
				hoursTextViewList.get(2).setText("23:00");
				hoursTextViewList.get(3).setText("23:30");
				hoursTextViewList.get(4).setText("00:00");
				hoursTextViewList.get(5).setText("00:30");
				hoursTextViewList.get(6).setText("01:00");
				hoursTextViewList.get(7).setText("01:30");
				hoursTextViewList.get(8).setText("02:00");
				hoursTextViewList.get(9).setText("02:30");
				hoursTextViewList.get(10).setText("03:00");
				hoursTextViewList.get(11).setText("03:30");
				hoursTextViewList.get(12).setText("04:00");
				hoursTextViewList.get(13).setText("04:30");
				hoursTextViewList.get(14).setText("05:00");
				hoursTextViewList.get(15).setText("05:30");
				break;
		}
	}
	
	private void setPresent()
	{
		for (int i = 0; i < checkBoxesPresent.size(); i++)
		{
			employees.getEmployee(i).setPresent(checkBoxesPresent.get(i).isChecked());
		}
	}

	private void setOnPushout()
	{
		for (int i = 0; i < radioButtonsPushout.size(); i++)
		{
			employees.getEmployee(i).setOnPushout(radioButtonsPushout.get(i).isChecked());
		}
	}
	
	private void setIndividual()
	{
		Spinner shiftSpinner = (Spinner) findViewById(R.id.shiftSpinner);
		int shift = (int) shiftSpinner.getSelectedItemId();

		employees.setShift(shift);
	}
	
	private void buildHarmonogram()
	{
		employees.buildHarmonograms();
	}
	
	private void printHarmonograms()
	{
		for (int i = 0; i < employeesHoursTextViewList.size(); i++)
		{
			for (int h = 0; h < Employee.HOURS; h++)
			{
				employeesHoursTextViewList.get(i).get(h).setText(employees.getEmployee(i).getHarmonogram(h));
			}
		}
	}
	
	public void onClickButtonCreate (View view)
	{
		setShift();
		setPresent();
		setOnPushout();
		setIndividual();
		int availableEmployees = 0;
		for (Employee employee : employees.getEmployees())
		{
			if (employee.isAvailable())
			{
				availableEmployees++;
			}
		}
		if (availableEmployees > 1)
		{
			buildHarmonogram();
			printHarmonograms();
		} else {
			Toast toast = Toast.makeText(this, "Nie no, bez przesady", Toast.LENGTH_SHORT);
			toast.show();
		}
		
	}
	
	public void onClickButtonRotate(View view)
	{
		employees.increaseEmployeeIndex();
		onClickButtonCreate(view);
	}
}
