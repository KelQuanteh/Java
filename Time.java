import java.util.Scanner;

public class Time {
    private int horas; 
    private int minutos;

    public Time(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public boolean isAnterior(Time other) {
        if (other.horas < this.horas)
            return true;
        return other.horas == this.horas && other.minutos < this.minutos;
    }

    public boolean isPosterior(Time other) {
        if (other.horas > this.horas)
            return true;
        return other.horas == this.horas && other.minutos > this.minutos;
    }

    public boolean isEquals(Time other) {
        return other.horas == this.horas && other.minutos == this.minutos;
    }

    public String toString() {
        return String.format("%02dh:%02dm", this.horas, this.minutos);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora e o minuto do primeiro horário (ex: 10 30): ");
        Time time1 = new Time(input.nextInt(), input.nextInt());

        System.out.print("Digite a hora e o minuto do segundo horário (ex: 12 15): ");
        Time time2 = new Time(input.nextInt(), input.nextInt());

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);

        if (time1.isAnterior(time2)) 
            System.out.println("A primeira é anterior à segunda");
        else if (time1.isPosterior(time2))
            System.out.println("A primeira é posterior à segunda");
        else 
            System.out.println("A primeira é igual à segunda");

        input.close();
    }
}
