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


public class vkl_2 extends JPanel  {
	/*Класс Vkl_2, который доступен для любого файла из пакета pack наследует 
	функции элемента JPanel */


	
	private JPanel Panel_text_1, Panel_text_2, Panel_button;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton del, calc;// кнопки Рассчитать и очистить которые доступны только для данного класса
	public static JLabel label_1,label_2,label_3,label_4,label_5,label_6,label_7,label_8,label_9,label_10,
	label_11,label_12,label_13,label_14,label_15,label_16,label_17,label_18,label_19,label_20,
	label_n,label_n_1,label_n_2,label_vot, label_hv, label_g, label_gv, label_ot, label_el,label_itogo;
	// Панели на которых располагается текст
	
	public static JTextField s, kol, vot_rash, vot_t, hv_rash, hv_t, g_rash, g_t, gv_rash, gv_t,
	ot_t, el_rash, el_t;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	private JCheckBox vot_s, vot_norm, hv_s, hv_norm, g_s, g_norm, gv_s, gv_norm, ot_norm, el_s, el_norm;// компонент флажок
	public static int int_vot_s=0, int_vot_norm=0, int_hv_s=0, int_hv_norm=0, int_g_s=0, int_g_norm=0, 
			int_gv_s=0, int_gv_norm=0, int_ot_norm=0, int_el_s=0, int_el_norm=0;
	private int int_vot=1, int_hv=1, int_g=1,int_gv=1,int_el=1;
	//переменная типа integer, доступная любому классу
/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/


	
	
	public vkl_2() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Vkl_2 - панель, на ней будут все компоненты которые будут отображаться на 2 вкладке .*/
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        Panel_text_1 = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста
        Panel_text_2 = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
        Panel_button = new JPanel();//Панель на которой располагается кнопка

		add(Panel_text_1, BorderLayout.NORTH);//Добавление панели Panel_text_1 наверх
		add(Panel_text_2, BorderLayout.CENTER);//Добавление панели Panel_text_2 по центру
		add(Panel_button, BorderLayout.SOUTH);//Добавление панели Panel_button снизу

		Panel_text_1.setBorder(new EmptyBorder(10,10,10,10));
		/*установка внутренних отступов(сверху,слева,снизу,справа) */
		Panel_text_2.setBorder(new EmptyBorder(0,10,35,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		Panel_text_1.setLayout(new GridLayout(2,2,0,5));//на панели 2 строки,2столбцa 
		Panel_text_2.setLayout(new GridLayout(13,4,25,5));/* на панеле будет 13 строк, 4 столбца, расстояние между
		 столбцами 25, расстояние между строками 5 */
		Panel_button.setLayout(new GridLayout(1,2));//на панели 1 строка,2столбцa, будeт расположенs кнопка

				label_1 = new JLabel("Количество зарегистрированных граждан:", JLabel.LEFT);
		label_2 = new JLabel("Общая площадь, кв.м.:", JLabel.LEFT);
		label_3 = new JLabel("1. Водоотведение", JLabel.LEFT);
		label_4 = new JLabel("Расход / Норматив:", JLabel.LEFT);
		label_5 = new JLabel("Тариф:", JLabel.LEFT);
		label_6 = new JLabel("2. Холодное водоснабжение", JLabel.LEFT);
		label_7= new JLabel("Расход / Норматив:", JLabel.LEFT);
		label_8= new JLabel("Тариф:", JLabel.LEFT);
		label_9= new JLabel("3. Газоснабжение", JLabel.LEFT);
		label_10= new JLabel("Расход / Норматив:", JLabel.LEFT);
		label_11= new JLabel("Тариф:", JLabel.LEFT);
		label_12= new JLabel("4. Горячее водоснабжение", JLabel.LEFT);
		label_13= new JLabel("Расход / Норматив:", JLabel.LEFT);
		label_14= new JLabel("Тариф:", JLabel.LEFT);
		label_15= new JLabel("5. Отопление", JLabel.LEFT);
		label_17= new JLabel("Тариф:", JLabel.LEFT);
		label_18= new JLabel("6. Электроснабжение", JLabel.LEFT);
		label_19= new JLabel("Расход / Норматив:", JLabel.LEFT);
		label_20= new JLabel("Тариф:", JLabel.LEFT);
		label_16= new JLabel("Итого:", JLabel.RIGHT);
		label_vot= new JLabel("", JLabel.LEFT);
		label_hv= new JLabel("", JLabel.LEFT);
		label_g= new JLabel("", JLabel.LEFT);
		label_gv= new JLabel("", JLabel.LEFT);
		label_ot= new JLabel("", JLabel.LEFT);
		label_el= new JLabel("", JLabel.LEFT);
		label_itogo= new JLabel("", JLabel.LEFT);
		label_n= new JLabel("");
		label_n_1= new JLabel("");
		label_n_2= new JLabel("");

		//цвет текста label - синий
		label_3.setForeground(Color.BLUE); 
		label_6.setForeground(Color.BLUE); 
		label_9.setForeground(Color.BLUE); 
		label_12.setForeground(Color.BLUE); 
		label_15.setForeground(Color.BLUE); 
		label_18.setForeground(Color.BLUE); 
		label_vot.setForeground(Color.BLUE); 
		label_hv.setForeground(Color.BLUE); 
		label_g.setForeground(Color.BLUE); 
		label_gv.setForeground(Color.BLUE); 
		label_ot.setForeground(Color.BLUE); 
		label_el.setForeground(Color.BLUE); 
		//цвет текста label - красный
		label_16.setForeground(Color.RED); 
		label_itogo.setForeground(Color.RED); 


		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст 
		 будет выводиться. JLabel.CENTER - выравнивание по центру,
		JLabel.RIGHT - выравнивание по правому краю */
		
		del = new JButton("Очистить"); //В скобках - надпись на кнопке
		calc = new JButton("Рассчитать"); //В скобках - надпись на кнопке

		kol = new JTextField();
		s = new JTextField();
		vot_rash = new JTextField();
		vot_t = new JTextField();		
		hv_rash = new JTextField();
		hv_t = new JTextField();
		g_rash = new JTextField();
		g_t = new JTextField();
		gv_rash = new JTextField();
		gv_t = new JTextField();
		ot_t = new JTextField();
		el_rash = new JTextField();
		el_t = new JTextField();

		//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)		
		kol.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		s.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		vot_rash.setMargin(new Insets(2, 5, 2, 5));
    	vot_t.setMargin(new Insets(2, 5, 2, 5));
		hv_rash.setMargin(new Insets(2, 5, 2, 5));
		hv_t.setMargin(new Insets(2, 5, 2, 5));
		g_rash.setMargin(new Insets(2, 5, 2, 5));
    	g_t.setMargin(new Insets(2, 5, 2, 5));
		gv_rash.setMargin(new Insets(2, 5, 2, 5));
		gv_t.setMargin(new Insets(2, 5, 2, 5));
    	ot_t.setMargin(new Insets(2, 5, 2, 5));
		el_rash.setMargin(new Insets(2, 5, 2, 5));
		el_t.setMargin(new Insets(2, 5, 2, 5));
    	//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
 
		
		//компонет флажок 
		vot_s = new JCheckBox("счетчик");
		vot_norm = new JCheckBox("норматив");
		hv_s = new JCheckBox("счетчик");
		hv_norm = new JCheckBox("норматив");
		g_s = new JCheckBox("счетчик");
		g_norm = new JCheckBox("норматив");
		gv_s = new JCheckBox("счетчик");
		gv_norm = new JCheckBox("норматив");	
		ot_norm = new JCheckBox("норматив");
		el_s = new JCheckBox("счетчик");
		el_norm = new JCheckBox("норматив");		
		
		Panel_button.add(del);//Добавление кнопки на панель Panel_button
		Panel_button.add(calc);//Добавление кнопки на панель Panel_button
		
		//Добавление компонентов JLabel, JTextField, JCheckBox на панели Panel_text_1 и Panel_text_2
		Panel_text_1.add(label_1);
		Panel_text_1.add(kol);
		Panel_text_1.add(label_2);
		Panel_text_1.add(s);

		Panel_text_2.add(label_3);
		Panel_text_2.add(label_vot);
		Panel_text_2.add(label_6);
		Panel_text_2.add(label_hv);
		Panel_text_2.add(vot_s);
		Panel_text_2.add(vot_norm);
		Panel_text_2.add(hv_s);
		Panel_text_2.add(hv_norm);

		Panel_text_2.add(label_4);
		Panel_text_2.add(vot_rash);
		Panel_text_2.add(label_7);
		Panel_text_2.add(hv_rash);
		Panel_text_2.add(label_5);
		Panel_text_2.add(vot_t);
		Panel_text_2.add(label_8);
		Panel_text_2.add(hv_t);
		
		Panel_text_2.add(label_9);
		Panel_text_2.add(label_g);
		Panel_text_2.add(label_12);
		Panel_text_2.add(label_gv);
		Panel_text_2.add(g_s);
		Panel_text_2.add(g_norm);
		Panel_text_2.add(gv_s);
		Panel_text_2.add(gv_norm);

		Panel_text_2.add(label_10);
		Panel_text_2.add(g_rash);
		Panel_text_2.add(label_13);
		Panel_text_2.add(gv_rash);
		Panel_text_2.add(label_11);
		Panel_text_2.add(g_t);
		Panel_text_2.add(label_14);
		Panel_text_2.add(gv_t);

		Panel_text_2.add(label_15);
		Panel_text_2.add(label_ot);
		Panel_text_2.add(label_18);
		Panel_text_2.add(label_el);
		Panel_text_2.add(ot_norm);
		Panel_text_2.add(label_n);		
		Panel_text_2.add(el_s);
		Panel_text_2.add(el_norm);

		Panel_text_2.add(label_17);
		Panel_text_2.add(ot_t);
		Panel_text_2.add(label_19);
		Panel_text_2.add(el_rash);
		Panel_text_2.add(label_n_1);
		Panel_text_2.add(label_n_2);
		Panel_text_2.add(label_20);
		Panel_text_2.add(el_t);
		Panel_text_2.add(label_16);
		Panel_text_2.add(label_itogo);
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Panel_text_1 и Panel_text_2

		// сделать поля для ввода теста недоступными
		vot_rash.setEditable(false);
		vot_t.setEditable(false);
		hv_rash.setEditable(false);
		hv_t.setEditable(false);
		g_rash.setEditable(false);
		g_t.setEditable(false);
		gv_rash.setEditable(false);
		gv_t.setEditable(false);
		ot_t.setEditable(false);
		el_rash.setEditable(false);
		el_t.setEditable(false);

		// цвет текста - светло серый
		label_4.setForeground(Color.LIGHT_GRAY); 
		label_5.setForeground(Color.LIGHT_GRAY); 
		label_7.setForeground(Color.LIGHT_GRAY); 
		label_8.setForeground(Color.LIGHT_GRAY); 
		label_10.setForeground(Color.LIGHT_GRAY); 
		label_11.setForeground(Color.LIGHT_GRAY); 
		label_13.setForeground(Color.LIGHT_GRAY); 
		label_14.setForeground(Color.LIGHT_GRAY); 
		label_17.setForeground(Color.LIGHT_GRAY); 
		label_19.setForeground(Color.LIGHT_GRAY); 
		label_20.setForeground(Color.LIGHT_GRAY); 
				
/* Слушатель события для компонента флажок Счетчик ВОДООТВЕДЕНИЕ*/	
		vot_s.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==vot_s)//если событие произошло именно с флажком vot_s, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что будут вводиться показания счетчика */
						 int_vot_s=1;//переменная, ввод данных счетчика, 1-да, 0-нет
						 int_vot_norm=0;//переменная, расчет по нормативу, 1-да, 0-нет
						 vot_norm.setSelected(false);//если флажок "Норматив" был включен - выключить его
						 	// поля для ввода показаний счетчика - доступны
							vot_rash.setEditable(true);
							// цвет текста - черный
							label_4.setForeground(Color.BLACK); 
						}
					else { //флажок выключен
						int_vot_s=0;//переменная, ввод данных счетчика, 1-да, 0-нет			 	
						// поля для ввода показаний счетчика - недоступны
						vot_rash.setEditable(false);
						// цвет текста - светло-серый
						label_4.setForeground(Color.LIGHT_GRAY); 
					}
			}                                                       
    	   }); 	

/* Слушатель события для компонента флажок Норматив ВОДООТВЕДЕНИЕ*/	
		vot_norm.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==vot_norm)//если событие произошло именно с флажком vot_norm, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что расчет будет произведет по нормативу */
						 int_vot_norm=1;//переменная, ввод данных счетчика, 1-да, 0-нет
						 int_vot_s=0;//переменная, расчет по нормативу, 1-да, 0-нет
						 vot_s.setSelected(false);//если флажок "Счетчик" был включен - выключить его
						 // поля для ввода показаний счетчика - недоступны
							vot_rash.setEditable(false);
							// цвет текста - светло-серый
							label_4.setForeground(Color.LIGHT_GRAY); 
						}
					else { //флажок выключен
						int_vot_norm=0;//переменная, расчет по нормативу, 1-да, 0-нет
					}
			}                                                       
    	   }); 
/* Слушатель события для компонента флажок Счетчик ХОЛОДНОЕ ВОДОСНАБЖЕНИЕ*/	
		hv_s.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==hv_s)//если событие произошло именно с флажком hv_s, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что будут вводиться показания счетчика */
						 int_hv_s=1;//переменная, ввод данных счетчика, 1-да, 0-нет
						 int_hv_norm=0;//переменная, расчет по нормативу, 1-да, 0-нет
						 hv_norm.setSelected(false);//если флажок "Норматив" был включен - выключить его
						 	// поля для ввода показаний счетчика - доступны
						 	hv_rash.setEditable(true);
							// цвет текста - черный
							label_7.setForeground(Color.BLACK); 
						}
					else { //флажок выключен
						int_hv_s=0;//переменная, ввод данных счетчика, 1-да, 0-нет			 	
						// поля для ввода показаний счетчика - недоступны
						hv_rash.setEditable(false);
						// цвет текста - светло-серый
						label_7.setForeground(Color.LIGHT_GRAY); 
					}
			}                                                       
    	   }); 	

/* Слушатель события для компонента флажок Норматив ХОЛОДНОЕ ВОДОСНАБЖЕНИЕ*/	
		hv_norm.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==hv_norm)//если событие произошло именно с флажком hv_norm, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что расчет будет произведет по нормативу */
						 int_hv_norm=1;//переменная, ввод данных счетчика, 1-да, 0-нет
						 int_hv_s=0;//переменная, расчет по нормативу, 1-да, 0-нет
						 hv_s.setSelected(false);//если флажок "Счетчик" был включен - выключить его
						 // поля для ввода показаний счетчика - недоступны
						 hv_rash.setEditable(false);
							// цвет текста - светло-серый
						label_7.setForeground(Color.LIGHT_GRAY); 
						}
					else { //флажок выключен
						int_hv_norm=0;//переменная, расчет по нормативу, 1-да, 0-нет
					}
			}                                                       
    	   }); 
/* Слушатель события для компонента флажок Счетчик ГАЗОСНАБЖЕНИЕ*/	
		g_s.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==g_s)//если событие произошло именно с флажком g_s, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это значит 
					что будут вводиться показания счетчика */
						 int_g_s=1;//переменная, ввод данных счетчика, 1-да, 0-нет
						 int_g_norm=0;//переменная, расчет по нормативу, 1-да, 0-нет
						 g_norm.setSelected(false);//если флажок "Норматив" был включен - выключить его
						 	// поля для ввода показаний счетчика - доступны
						 	g_rash.setEditable(true);
							// цвет текста - черный
							label_10.setForeground(Color.BLACK); 
						}
					else { //флажок выключен
						int_g_s=0;//переменная, ввод данных счетчика, 1-да, 0-нет			 	
						// поля для ввода показаний счетчика - недоступны
						g_rash.setEditable(false);
						// цвет текста - светло-серый
						label_10.setForeground(Color.LIGHT_GRAY); 
					}
			}                                                       
    	   }); 	
