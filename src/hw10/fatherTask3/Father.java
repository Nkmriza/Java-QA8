package hw10.fatherTask3;

public class Father {
    /*Реалізувати цю ситуацію у коді.
• Батьку, у якого є ім'я та певна сума в кишені, повинен сходити до магазину.
• У магазині є 5 типів продуктів: яблуко, картопля, молоко, пиво та тютюн.
• Кожен товар має свою ціну.
• Батькові необхідно зробити покупку, максимум він може купити лише два типи продуктів.
• Але будь-який тип продуктів може бути куплений у будь-якій кількості.
Тобто. він може купити лише молоко. Або купити 3 молока, та 2 яблука.
 Але він не може купити яблуко, три пива та дві картоплини. Неприємна ситуація
  станеться у кількох ситуаціях:


Якщо сума придбання перевищує кількість грошей у кишені батька.
Якщо він принесе додому пиво чи тютюн.
Якщо кількість хоча б одного з куплених товарів не поділятиметься на три.
(Тобто він не зможе порівну розділити куплений продукт між собою, дружиною та дитиною)
Реалізувати цю ситуацію з допомогою об'єктно орієнтованого підходу. Намагайтеся
використовувати перелічувальний тип даних Enum. А також винятки. Постаратися обробити
всі винятки в сторонньому методі, а не в тілі методу, створеного у батька.

Якщо батькові вдасться уникнути неприємної ситуації на консоль має вивестися
повідомлення приблизно такого типу:
Шановний Валентин вартість ваших покупок 150. Ви придбали APPLE у кількості 3, та MILK у кількості 6.*/
    public String fatherName;
    public double amountOfMoneyInPocket;

    public Father(String fatherName, double amountOfMoneyInPocket) {
        this.fatherName = fatherName;
        this.amountOfMoneyInPocket = amountOfMoneyInPocket;
    }

    public void buyingProducts(ProductsType type1, ProductsType type2) {
        double totalCost = type1.getPrice() + type2.getPrice();
        if (totalCost > amountOfMoneyInPocket) {
            System.out.println("У вас не вистачає грошей");
        }  if (type1 == ProductsType.BEER || type2 == ProductsType.BEER ||
                type1 == ProductsType.CIGARETTES || type2 == ProductsType.CIGARETTES) {
            System.out.println("Цього не варто це купувати!");
        }  if (totalCost % 3 != 0) {
            System.out.println();
        }
        System.out.println("Шановний " + fatherName + ", вартість вашої покупки " + totalCost +
                ". Ви придбали: " + type1.getProductName() + " та " + type2.getProductName());
    }
}