package Lesson5;
public class Employee {

 String name;
 String post;
 String email;
 String phoneNumber;
 int salary;
 int age;

 public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
  this.name = name;
  this.post = post;
  this.email = email;
  this.phoneNumber = phoneNumber;
  this.salary = salary;
  this.age = age;
 }

 public int getAge() {
  return age;
 }

 public void PutData() {
  System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " + " Телефон: " + phoneNumber + " | " + " Зарплата: " + salary + " | " + " Возраст: " + age);
 }


   public static void main(String[] args) {
    Employee[] persArray = new Employee[5];
    persArray[0] = new Employee("Иванов Иван", "инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Employee("Иванов Семен", "редактор", "semen@mailbox.com", "892312313", 27000, 21);
    persArray[2] = new Employee("Иванов Дмитрий", "менеджер", "dmitriy@mailbox.com", "892312314", 32000, 39);
    persArray[3] = new Employee("Иванов Александр", "сантехник", "alex@mailbox.com", "892312315", 25000, 47);
    persArray[4] = new Employee("Иванов Матвей", "директор", "matvey@mailbox.com", "892312316", 60000, 60);

    for (int i = 0; i < persArray.length; i++ )
     if (persArray[i].age > 40) persArray[i].getAge();
   }
  }

