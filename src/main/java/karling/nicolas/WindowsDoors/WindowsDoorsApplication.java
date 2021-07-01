package karling.nicolas.WindowsDoors;

import karling.nicolas.WindowsDoors.Model.Door;
import karling.nicolas.WindowsDoors.Model.Windows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WindowsDoorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WindowsDoorsApplication.class, args);
		Door door1 = new Door(
				75,
				195,
				"sliding",
				"brown",
				"digital",
				"lever",
				"black");

		Windows windows1 = new Windows(
				120,
				140,
				"sliding",
				"rectangular",
				"gray");

		System.out.println(door1);
		System.out.println(windows1);


	}
}
