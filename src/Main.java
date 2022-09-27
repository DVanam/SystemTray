import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {


    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
//        Проверка поддерживается ил нашей системой этот Tray.
        if (SystemTray.isSupported()) {
//            Получить наш Системный Трей.
            SystemTray tray = SystemTray.getSystemTray();
//            Выбор иконки.
            Image image = new ImageIcon("src/logo.png", "desc").getImage();
//            PopupMenu -Выбор Миню правым кликом. Различные Миню.
            PopupMenu popupMenu = new PopupMenu();


            MenuItem menuItem = new MenuItem("One");
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    JFrame jFrame = getJFrame();
                    new CalculationFrame();
                }
            });

            popupMenu.add(menuItem);
            popupMenu.add(new MenuItem("Two"));
            popupMenu.add(new MenuItem("Three"));


//            tray.add-Выведения.
//            image-иконка.
//            "Tray description"-При наведение выводит Информацию.
//            popupMenu-Меню кнопок.
            tray.add(new TrayIcon(image, "Tray description", popupMenu));
        }
    }

//    JFrame -Создание Окна + размещение его на экрани.
    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        jFrame.setSize(500,300); // Размер окна.
//        jFrame.setLocation(500, 400); // Область на Экране.

//        Toolkit -Набор для работы с нашими приложениями.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension -Размен нашего окна. Есть ширина и высота нашего Экрана.
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//        Задаем размер по 4 сторонам Экрана.
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);


        jFrame.setTitle("this my app"); // Названия.
//        jFrame.setIconImage(" ");// картинка
        return jFrame;
    }




}
