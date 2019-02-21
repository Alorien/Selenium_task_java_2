package achulkov;

import org.junit.Test;
import pages.InsurationPage;
import pages.MainPage;
import pages.MinInsurationPage;
import pages.SendAppPage;



public class MyRefactoringTest extends BaseTest {


    @Test
    public void testInsurance() throws Exception {
        //Переход на начальную страницу
      driver.get(baseUrl + "/");
      MainPage mainPage = new MainPage(driver);
        //Нажатие на кнопку Страхование
      mainPage.selectMenuItem("Страхование");
        //Нажатие на кнопку Путешествия и покупки
      mainPage.selectInsuranceItem("Путешествия и покупки");
        //Проверка наличия текста на странице
      InsurationPage insurationPage = new InsurationPage(driver);
      insurationPage.checkTextPage("Страхование путешественников");
        //Нажатие на кнопку Оформить онлайн
      insurationPage.buttonRegisterOnline.click();
        //Переход на новую вкладку и выбор минимальной страховки
      MinInsurationPage minInsurationPage = new MinInsurationPage(driver);
      minInsurationPage.selectMinIsuration("Минимальная");
        //Нажатие на кнопку Оформить онлайн
      minInsurationPage.selectRegItem("Оформить");
        //Заполнение полей и проверка на корректное заполнение полей
      SendAppPage sendAppPage = new SendAppPage(driver);
      sendAppPage.fillField("Фамилия Загранпаспорта", "Ivanov");
      sendAppPage.fillField("Имя Загранпаспорта", "Ivan");
      sendAppPage.fillField("Дата рождения в загранпаспорте", "01.02.1990");
      sendAppPage.fillField("Фамилия", "Иванов");
      sendAppPage.fillField("Имя", "Иван");
      sendAppPage.fillField("Отчество", "Иванович");
      sendAppPage.fillField("Дата рождения", "01.02.1990");
      sendAppPage.fillField("Пол", "Мужской");
      sendAppPage.fillField("Серия паспорта", "1111");
      sendAppPage.fillField("Номер паспорта", "111111");
      sendAppPage.fillField("Орган выдавший паспорт", "ТП №1 по г. Москва");
      sendAppPage.fillField("Дата выдачи", "15.02.2008");
        //Нажатие на кнопку Продолжить
      sendAppPage.sendButton.click();
        //Проверка наличии текста на странице
      sendAppPage.checkFieldErrorMessage("Заполнены не все обязательные поля");


    }
}