import javax.swing.*;
import java.awt.*;

public class CalculationFrame extends JFrame {

//    Делаем часьтю класса. И поле глобальным.
    private JTextField inputArea; // Создаем поле Вводаы.

//    Благодаря конструктору нам пришло множество методов JFrame.
    public CalculationFrame () {
        setTitle("Calculation + -  v.01"); // setTitle-Названия.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        Dimension -Размен нашего окна. Есть ширина и высота нашего Экрана.
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(dimension.width /2 - 250 ,dimension.height /2 - 150, 400, 300);// Задаем размер по 4 сторонам Экрана.

//        setJMenuBar -Устанавливаем Выпадающии меню
//        createMenuBar -Использовать метод.
        setJMenuBar(createMenuBar());

//        setLayout -Класс отвечающий за расстановку Элементов.
//        BorderLayout -Будет занимать большую часть пространства.
        setLayout(new BorderLayout());// BorderLayout -Орентируеться по 4 сторонам.

        add(createTopPanel(), BorderLayout.SOUTH);
        add(getNumbersPanel(), BorderLayout.NORTH);

        setVisible(true);// setVisible(true)-Делает форму JFrame -мдимым.

    }

    private JPanel getNumbersPanel() {
        JPanel numbers = new JPanel();

        numbers.add(new Label("Numbers One"));

        return numbers;
    }

//    JPanel--Компоненты содержит другие компоненты. Блок для строительства.
//    Устанавливаем поле вверху.
    private  JPanel createTopPanel() {
        JPanel top = new JPanel();
//        setLayout -Компоновщик для JPanel. Для поле ввода.
        top.setLayout(new BorderLayout()); // setLayout -Устанавливаем new BorderLayout() -Размер для кнопа
        inputArea = new JTextField(); // Передаем полю

//        top.add -Добавляем компоненты в JPanel -Компоновщику.
//        inputArea -Передаем ему наше поле.
        top.add(inputArea, BorderLayout.CENTER); // BorderLayout.CENTER--выбираем центр.

        return top;
    }

//    Выпадающие меню. Бар меню.
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar(); // JMenuBar-Создания бар. Он же выпадающее меню
        JMenu fileMenu = new JMenu("File"); // JMenu-Создания выпадающего меню в бар полоска с названием "File".

        JMenuItem openItem = new JMenu("Open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenu("Exit");// JMenuItem-Создания Кнопки с названиям "Exit".
        fileMenu.add(exitItem);// fileMenu.add-Добавления этой кнопки "Exit".

        menuBar.add(fileMenu);//

        return menuBar;

    }

}
