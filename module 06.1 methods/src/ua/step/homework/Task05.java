package ua.step.homework;

import java.util.Scanner;

/**
 * Королю нужно убить дракона, но в его казне мало средств для покупки армии.
 * Нужно создать программу, используя методы, которая поможет рассчитать
 * минимальное количество копейщиков, которое необходимо, чтобы убить дракона.
 *  
 * C клавиатуры вводятся данные: 
 * • здоровья дракона 
 * • атака дракона 
 * • здоровье одного копейщика. 
 * • атака одного копейщика. 
 *  	Защита, меткость и т. п. не учитывать. 
 *  Копейщики наносят удар первыми (общий нанесённый урон – это сумма
 * атак всех живых копейщиков). Если атака дракона превышает значение жизни
 * копейщика (например у копейщика жизни 10, а атака 15), то умирает несколько
 * копейщиков, а оставшийся урон идёт одному из копейщиков. Например, жизнь
 * дракона 500, атака 55, жизнь одного копейщика 10, атака 10, а количество
 * копейщиков при данных условиях 20. 
 * Лог боя для данного примера должен выглядеть так: 
 * Итерация 15 
 * Копейщики атакуют (урон 200) – у дракона осталось 300 жизней 
 * Дракон атакует – осталось 15 копейщиков, один из которых ранен (осталось 5 жизней) 
 * Копейщики атакуют – у дракона осталось 150 жизней 
 * Дракон атакует – осталось 9 копейщиков 
 * Копейщики атакуют – у дракона осталось 60 жизней 
 * Дракон атакует – осталось 4 копейщика , один из которых ранен (осталось 5 жизней) 
 * Копейщики атакуют – у дракона осталось 20 жизней 
 * Дракон атакует и побеждает
 */

public class Task05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введете кол-во очков здоровья дракона.");
		int dragonHp = scanner.nextInt();

		System.out.println("Введете кол-во очков атаки дракона.");
		int dragonAttack = scanner.nextInt();

		System.out.println("Введете кол-во очков здоровья одного копейщика.");
		int warriorHp = scanner.nextInt();

		System.out.println("Введете кол-во очков атаки одного копейщика. ");
		int warriorAttack = scanner.nextInt();

		int warriorCount = 0;
		int roundCount = 10;
		int allWarriorHp = warriorCount * warriorHp;
		int iteration = 1; // счетчик раунда 

		War(dragonHp, dragonAttack, warriorHp, warriorAttack, warriorCount, roundCount, allWarriorHp, iteration);

	}

	public static void War(int dragonHp, int dragonAttack, int warriorHp, int warriorAttack, int warriorCount,
			int roundCount, int allWarriorHp, int iteration) {

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			System.out.println("Итерация " + i);
			warriorCount = i;
			allWarriorHp = warriorCount * warriorHp;

			if (Battle(dragonHp, dragonAttack, warriorHp, warriorAttack, warriorCount, roundCount, allWarriorHp,
					iteration) == true) {
				break;
			}
		}
	}

	public static boolean Battle(int dragonHp, int dragonAttack, int warriorHp, int warriorAttack, int warriorCount,
			int roundCount, int allWarriorHp, int iteration) {

		while (dragonHp >= 0 && warriorCount >= 0) {

			warriorCount = warriorCount(allWarriorHp, warriorCount, warriorHp);
			int allWarriorAttack = allWarriorAttack(warriorCount, warriorAttack);
			dragonHp = dragonHp(dragonHp, warriorCount, warriorAttack);
			if (WarriorAttackPrint(iteration, dragonHp, warriorCount, warriorAttack) == true) {
				return true;

			}

			dragonAttack = dragonAttack(dragonAttack);
			allWarriorHp = allWarriorHp(allWarriorHp, dragonAttack);
			warriorCount = warriorCount(allWarriorHp, warriorCount, warriorHp);
			String iWarrior = injuredWarrior(allWarriorHp, warriorCount, warriorHp);
			if (dragonAttackPrint(dragonHp, warriorCount, warriorAttack, iWarrior) == true) {
				break;
			}
			iteration++;
		}
		return false;
	}

	public static boolean WarriorAttackPrint(int iteration, int dragonHp, int warriorCount, int warriorAttack) {
		int allWarriorAttack = allWarriorAttack(warriorCount, warriorAttack);
		// System.out.println("Раунд " + iteration);

		if (dragonHp <= 0) {
			System.out.println("Копейщики атакуют и побеждают\r\n");
			return true;
		}
		System.out.println(
				"Копейщики атакуют (урон " + allWarriorAttack + ") – у дракона осталось " + dragonHp + " жизней");
		return false;
	}

	public static boolean dragonAttackPrint(int dragonHp, int warriorCount, int warriorAttack, String injuredWarrior) {
		if (warriorCount <= 0) {
			System.out.println("Дракон атакует и побеждает\r\n");
			return true;
		}

		String w;
		int l = warriorCount % 10;
		if (warriorCount < 21 && warriorCount < 5) {
			if (l == 1) {
				w = " копейщик";
			} else if (l == 4 || l == 3 || l == 2) {
				w = " копейщика";
			} else {
				w = " копейщиков";
			}
		} else {
			w = " копейщиков";
		}
		System.out.println("Дракон атакует – осталось " + warriorCount + w + injuredWarrior);
		return false;
	}

	public static int dragonHp(int dragonHp, int warriorCount, int warriorAttack) {
		dragonHp = dragonHp - warriorCount * warriorAttack;
		return dragonHp;
	}

	public static int allWarriorAttack(int warriorCount, int warriorAttack) {
		int allWarriorAttack = warriorCount * warriorAttack;
		return allWarriorAttack;
	}

	public static int dragonAttack(int dragonAttack) {
		int attack = dragonAttack;
		return attack;
	}

	public static int allWarriorHp(int allWarriorHp, int dragonAttack) {
		allWarriorHp -= dragonAttack;
		return allWarriorHp;
	}

	public static int warriorCount(int allWarriorHp, int warriorCount, int warriorHp) {
		warriorCount = allWarriorHp / warriorHp;
		if (allWarriorHp % warriorHp > 0) {
			warriorCount += 1;
		}
		return warriorCount;
	}

	public static String injuredWarrior(int allWarriorHp, int warriorCount, int warriorHp) {
		if (allWarriorHp % warriorHp > 0) {
			int i = allWarriorHp % warriorHp;
			return ", один из которых ранен(осталось " + i + " жизней)";
		}
		return "";
	}
}
