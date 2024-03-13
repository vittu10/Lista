package Aplicaçao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import emp.Employe;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employe> list = new ArrayList<>();
		System.out.println("how many emp will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("employe # " + (i + 1) + ": ");
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("salary: ");
			Double salary = sc.nextDouble();

			Employe emp = new Employe(id, name, salary);
			list.add(emp);
		}
		System.out.println("enter the Employe Id that will have salary incrase: ");
		int idEmp = sc.nextInt();
		Integer pos = position(list, idEmp);
		if (pos == null) {
			System.out.println("this is does not exist");
		} else {
			System.out.println("enter percentagem");
			double perc = sc.nextInt();
			list.get(pos).increaseSalary(perc);

		}
		System.out.println();
		System.out.println("list of employe: ");

		for (Employe emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<Employe> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}
}
