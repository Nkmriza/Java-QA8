package hw7;

public class Summary {
    /*3) Створити клас Конспект. Клас повинен містити такі поля:

ПІБ студента;
Назва предмету;
Кількість сторінок;
Рік випуску;
Колір обкладинки.
Назва закладу, де навчається студент;*/
    public String fullName;
    public String nameOfASubject;
    public int pages;
    public int yearOfGraduation;
    public String color;
    public String nameOfSchool;

    public void getInfo() {
        System.out.println("ПІБ студента: " + fullName);
        System.out.println("Назва предмету: " + nameOfASubject);
        System.out.println("Кількість сторінок: " + pages);
        System.out.println("Рік випуску: " + yearOfGraduation);
        System.out.println("Колір обкладинки: " + color);
        System.out.println("Назва закладу, де навчається студент: " + nameOfSchool);
    }

    /*public static void main(String[] args) {
        Summary student = new Summary();
        student.fullName = "Волков ОВ";
        student.nameOfASubject = "Биология";
        student.getInfo();

    }*/
}
