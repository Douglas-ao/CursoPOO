package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		Integer quantities = sc.nextInt();

		for (int i = 0; i < quantities; i++) {

			System.out.println();
			System.out.println("Emploee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employees employees = new Employees(id, name, salary);

			list.add(employees);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer id = sc.nextInt();
		Integer posi = position(list, id);
		if (posi == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			list.get(posi).sum(percent);
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employees employees : list) {
			System.out.println(employees);
		}

		sc.close();

	}

	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
