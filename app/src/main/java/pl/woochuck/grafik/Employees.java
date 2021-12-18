package pl.woochuck.grafik;

import java.util.*;

public class Employees
{
	private List<Employee> employees;
	private int employeeIndex;
	private int shift;
	
	public Employees()
	{
		employeeIndex = 0;
		employees = new ArrayList<>();
		employees.add(new Employee("Pszczoła"));
		employees.add(new Employee("Sowa"));
		employees.add(new Employee("Kamil"));
		employees.add(new Employee("Adrian"));
		employees.add(new Employee("Darek"));
		employees.add(new Employee("Kuba"));
		employees.add(new Employee("Marcin"));
		employees.add(new Employee("Michał"));
		employees.add(new Employee("Sawi"));
		employees.add(new Employee("Toto"));
		employees.get(9).setIndividual(true);
	}

	public void setEmployeeIndex(int employeeIndex)
	{
		this.employeeIndex = employeeIndex;
	}

	public int getEmployeeIndex()
	{
		return employeeIndex;
	}
	
	public void increaseEmployeeIndex()
	{
		if (employeeIndex < employees.size() - 1)
		{
			employeeIndex = findNextAvailableEmployeeIndex(employeeIndex);
		} else {
			employeeIndex = findNextAvailableEmployeeIndex(-1);;
		}
	}
	
	private int findNextAvailableEmployeeIndex(int actualAvailableEmployeeIndex)
	{
		int nextAvailableEmployeeIndex = actualAvailableEmployeeIndex + 1;
		if (nextAvailableEmployeeIndex == employees.size())
		{
			nextAvailableEmployeeIndex = -1;
			return findNextAvailableEmployeeIndex(nextAvailableEmployeeIndex);
		} else if (employees.get(nextAvailableEmployeeIndex).isAvailable()) {
			return nextAvailableEmployeeIndex;
		} else {
			return findNextAvailableEmployeeIndex(nextAvailableEmployeeIndex);
		}
	}
	
	public void setShift(int shift)
	{
		this.shift = shift;
	}
	
	public void setOnPushout (int pushoutEmployeeIndex)
	{
		for (int i = 0; i < employees.size(); i++)
		{
			if (i == pushoutEmployeeIndex)
			{
				employees.get(i).setOnPushout(true);
			} else {
				employees.get(i).setOnPushout(false);
			}
		}
	}
	
	private void clearHarmonograms()
	{
		for (Employee employee : employees)
		{
			employee.clearHarmonogram();
		}
	}
	
	private void setAbsentHarmonograms()
	{
		for (Employee employee : employees)
		{
			if (!employee.isPresent()) 
			{
				employee.setAbsentHarmonogram();
			}
		}
	}
	
	private void setOnPushoutHarmonogram()
	{
		for (Employee employee : employees)
		{
			if (employee.isOnPushout()) 
			{
				employee.setOnPushoutHarmonogram();
			}
		}
	}
	
	public void setIndividualHarmonogram()
	{
		for (Employee employee : employees)
		{
			if (employee.isIndividual() && employee.isPresent()) 
			{
				switch (this.shift) {
					case 0:
						break;
					case 1:
						employee.setIndividualHarmonogram(8, 9);
						break;
					case 2:
						employee.setIndividualHarmonogram(6, 7);
						break;
				}
			}
		}
	}
	
	public void buildHarmonograms()
	{
		clearHarmonograms();
		setOnPushoutHarmonogram();
		setAbsentHarmonograms();
		setIndividualHarmonogram();
		
		int nextAvailableEmployeeIndex = findNextAvailableEmployeeIndex(employeeIndex - 1);
		for (int i = 0; i < Employee.HOURS; i++)
		{
			if (i == 0)
			{
				employees.get(nextAvailableEmployeeIndex).setCC(i);
				nextAvailableEmployeeIndex = findNextAvailableEmployeeIndex(nextAvailableEmployeeIndex);
				employees.get(nextAvailableEmployeeIndex).setBC(i);
				employees.get(nextAvailableEmployeeIndex).setCC(i + 1);
			} else if (i == Employee.HOURS - 1) {
				nextAvailableEmployeeIndex = findNextAvailableEmployeeIndex(nextAvailableEmployeeIndex);
				employees.get(nextAvailableEmployeeIndex).setBC(i);
			} else if (employees.get(9).getHarmonogram(i).equals(Employee.BC)) {
				continue;
			} else {
				nextAvailableEmployeeIndex = findNextAvailableEmployeeIndex(nextAvailableEmployeeIndex);
				employees.get(nextAvailableEmployeeIndex).setBC(i);
				employees.get(nextAvailableEmployeeIndex).setCC(i + 1);
			}
		}
	}
	
	public List<Employee> getEmployees()
	{
		return employees;
	}
	
	public Employee getEmployee(int index)
	{
		return employees.get(index);
	}
}
