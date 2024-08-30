public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanё";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника  — " + fullName);
    }


}