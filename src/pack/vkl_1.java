package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import javax.swing.*; // библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы 
import java.awt.event.*; /*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import java.awt.*; /*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	


public class vkl_1 extends JPanel  {
	/*Класс Vkl_1, который доступен для любого файла из пакета pack наследует 
	функции элемента JPanel */


	
	private JPanel Panel_text_1,Panel_text_2, Panel_button;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton but_vkl, but_new;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_1,label_2,label_3,label_4, label_5, label_6, label_7, label_8, label_9, 
	label_10, label_11,label_12, label_13; // Панели на которых располагается текст
	public static JTextField tar_ot, tar_vsn, tar_te, tar_vot, tar_g, tar_el, norm_hv, norm_gv, norm_vot, norm_g, norm_el;/* текстовые поля 
	в которые пользователь вводит данные, доступны для любого файла из пакета pack */
		/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/
	
	
	public vkl_1() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Vkl_1 - панель, на ней будут все компоненты которые будут отображаться на 1 вкладке .*/
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        Panel_text_1 = new JPanel();//Панель на которой  располагаются текстовые поля Тарифы на ком.услуги, Нормативы
        Panel_text_2 = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
        Panel_button = new JPanel();//Панель на которой располагается кнопка

		add(Panel_text_1, BorderLayout.NORTH);//Добавление панели Panel_text_1 наверх
		add(Panel_text_2, BorderLayout.CENTER);//Добавление панели Panel_text_2 по центру
		add(Panel_button, BorderLayout.SOUTH);//Добавление панели Panel_button снизу

		Panel_text_1.setBorder(new EmptyBorder(20,10,5,10));
		/*установка внутренних отступов(сверху,слева,снизу,справа) */
		Panel_text_2.setBorder(new EmptyBorder(15,10,200,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		Panel_text_1.setLayout(new GridLayout(1,2,0,15));//на панели 1 строка,2столбца (тарифы на ком.усл, нормативы)
		Panel_text_2.setLayout(new GridLayout(6,4,20,5));/* на панеле будет 6 строк, 4 столбца, расстояние между
		 столбцами 20, расстояние между строками 5 */
		Panel_button.setLayout(new GridLayout(1,2));//на панели 1 строка,2столбцa, будут расположены кнопки

		label_1 = new JLabel("Тарифы на коммунальные услуги", JLabel.CENTER);
		label_2 = new JLabel("Нормативы", JLabel.CENTER);
		label_3 = new JLabel("Отопление, руб/кв.м.:", JLabel.LEFT);
		label_4 = new JLabel("Холодное водоснабжение:", JLabel.LEFT);
		label_5 = new JLabel("Водоснабжение, руб/куб.м.", JLabel.LEFT);
		label_6 = new JLabel("Горячее водоснабжение: ", JLabel.LEFT);
		label_7 = new JLabel("Горячее водоснабжение, руб/куб.м.:", JLabel.LEFT);
		label_8 = new JLabel("Водоотведение:", JLabel.LEFT);
		label_9 = new JLabel("Водоотведение, руб/куб.м.:", JLabel.LEFT);
		label_10 = new JLabel("Газ, руб:", JLabel.LEFT);
		label_11= new JLabel("Газ, руб/куб.м.", JLabel.LEFT);
		label_12 = new JLabel("Электроэнергия:", JLabel.LEFT);
		label_13 = new JLabel("Электроэнергия, руб/куб.м.:", JLabel.LEFT);

		
		label_1.setForeground(Color.BLUE); 
		label_2.setForeground(Color.BLUE); 
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.RIGHT - выравнивание по правому краю
		*/
		
		but_vkl = new JButton("Перейти к расчету"); //В скобках - надпись на кнопке
		but_new = new JButton("Тарифы и нормативы 2017 года"); //В скобках - надпись на кнопке

			
		tar_ot = new JTextField("");
		tar_ot.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_ot.setToolTipText("Введите тарифную ставку на отопление");//всплывающая подсказка при наведении на текстовое поле
    	
		tar_vsn = new JTextField("");
		tar_vsn.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_vsn.setToolTipText("Введите тарифную ставку на водоснабжение");//всплывающая подсказка при наведении на текстовое поле

		tar_te = new JTextField("");
		tar_te.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_te.setToolTipText("Введите тарифную ставку на тепловую энергию");//всплывающая подсказка при наведении на текстовое поле
		
		tar_vot = new JTextField("");
		tar_vot.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_vot.setToolTipText("Введите тарифную ставку на водоотведение");//всплывающая подсказка при наведении на текстовое поле

		tar_g = new JTextField("");
		tar_g.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_g.setToolTipText("Введите тарифную ставку на газ");//всплывающая подсказка при наведении на текстовое поле

		tar_el = new JTextField("");
		tar_el.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		tar_el.setToolTipText("Введите тарифную ставку на электроэнергию");//всплывающая подсказка при наведении на текстовое поле
		
		norm_hv = new JTextField("");
		norm_hv.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		norm_hv.setToolTipText("Введите норматив, хол.водоснабжение");//всплывающая подсказка при наведении на текстовое поле
		
		norm_gv = new JTextField("");
		norm_gv.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		norm_gv.setToolTipText("Введите норматив, гор.водоснабжение");//всплывающая подсказка при наведении на текстовое поле

		norm_vot = new JTextField("");
		norm_vot.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		norm_vot.setToolTipText("Введите норматив, водоотведение ХВ");//всплывающая подсказка при наведении на текстовое поле

		norm_g = new JTextField("");
		norm_g.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		norm_g.setToolTipText("Введите норматив, газа");//всплывающая подсказка при наведении на текстовое поле
		
		norm_el = new JTextField("");
		norm_el.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		norm_el.setToolTipText("Введите норматив, элетроэнергия");//всплывающая подсказка при наведении на текстовое поле
		
		Panel_button.add(but_new);//Добавление кнопки на панель Panel_button
		Panel_button.add(but_vkl);//Добавление кнопки на панель Panel_button
		
		//Добавление компонентов JLabel, JTextField на панели Panel_text_1 и Panel_text_2
		Panel_text_1.add(label_1);
		Panel_text_1.add(label_2);
		
		Panel_text_2.add(label_3);
		Panel_text_2.add(tar_ot);
		Panel_text_2.add(label_4);
		Panel_text_2.add(norm_hv);
		Panel_text_2.add(label_5);
		Panel_text_2.add(tar_vsn);
		Panel_text_2.add(label_6);
		Panel_text_2.add(norm_gv);
		Panel_text_2.add(label_7);
		Panel_text_2.add(tar_te);
		Panel_text_2.add(label_8);
		Panel_text_2.add(norm_vot);
		Panel_text_2.add(label_9);
		Panel_text_2.add(tar_vot);
		Panel_text_2.add(label_10);
		Panel_text_2.add(norm_g);
		Panel_text_2.add(label_11);
		Panel_text_2.add(tar_g);
		Panel_text_2.add(label_12);
		Panel_text_2.add(norm_el);		
		Panel_text_2.add(label_13);
		Panel_text_2.add(tar_el);
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели panel_1 и panel_2


		but_vkl.addActionListener(new ActionListener(){    //добавляем слушателя события для кнопки 
			/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
		 	addActionListener - добавление слушателя ActionListener к кнопке
		  	new - Оператор new создает экземпляр указанного класса 
		  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
		  	который будет отвечать за реагирование на события. 
		  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
		  	Поэтому будет использоваться интерфейс "ActionListener", 
		  	предназначенный для обработки событий "ActionEvent".
		  	тело интерфейса указывается ниже после фигурной скобки "{"
    	    */
    	    public void actionPerformed(ActionEvent e) 
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/             
    	    {   
    	    
    	    	if ((index.isValidInput(tar_ot, "тариф, отопление"))&&
    	    		(index.isValidInput(tar_vsn, "тариф, водоснабжение"))&&
    	    		(index.isValidInput(tar_te, "тариф, тепловая энергия"))&&
    	    		(index.isValidInput(tar_vot, "тариф, водоотведение"))&&
    	    		(index.isValidInput(tar_g, "тариф, газ"))&&
    	    		(index.isValidInput(tar_el, "тариф, электроэнергия"))&&
    	    		(index.isValidInput(norm_hv, "норматив, холодное водоснабжение"))&&
    	    		(index.isValidInput(norm_gv, "норматив, горячее водоснабжение"))&&
    	    		(index.isValidInput(norm_vot, "норматив, водоотведение"))&&
    	    		(index.isValidInput(norm_g, "норматив, газ"))&&
    	    		(index.isValidInput(norm_el, "норматив, электроэнергия"))){
    	    		/*Проверка правильности введенных данных. Функция isValidInput расположена в файле Index
    	    		 *Например isValidInput(tar_ot, "", 1) 
    	    		 * tar_ot - поле которое необходимо проверить,
    	    		 * "" - сообщение которое выведется в случае если поле не заполнено,
    	    		 * 1 - указываем, что поле может быть пустым (значит и сообщение об ошибке не будет выводиться) */
    	    		
	    			index.JTP1.setEnabledAt(1, true);/*устанавливаем что вторая вкладка доступна */
	    			index.JTP1.setSelectedIndex(1); /*JTP1 - панель вкладок, расположенная в файле Index. 
	    			setSelectedIndex - указываем какая вкладка должна показываться. 1 - вкладка Расчет ком.услуг.
	    			Вкладка тарифы и нормативы - 0.
	    			*/

		         }
    	    }    	    	                                                        
    	   });
		but_new.addActionListener(new ActionListener(){    //добавляем слушателя события для кнопки 
			/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
		 	addActionListener - добавление слушателя ActionListener к кнопке
		  	new - Оператор new создает экземпляр указанного класса 
		  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
		  	который будет отвечать за реагирование на события. 
		  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
		  	Поэтому будет использоваться интерфейс "ActionListener", 
		  	предназначенный для обработки событий "ActionEvent".
		  	тело интерфейса указывается ниже после фигурной скобки "{"
    	    */
    	    public void actionPerformed(ActionEvent e) 
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/             
    	    {   

    	    	tar_ot.setText("23,07");
    	    	tar_vsn.setText("22,21");
    	    	tar_te.setText("147,1");
    	    	tar_vot.setText("20,47");
    	    	tar_g.setText("6,5");
    	    	tar_el.setText("2,74");
    	    	norm_hv.setText("4,798");
    	    	norm_gv.setText("3,219");
    	    	norm_vot.setText("4,798");
    	    	norm_g.setText("12");
    	    	norm_el.setText("139");
    	    	
    	    }    	    	                                                        
    	   });	
	}
	
}
