package pack;

import java.awt.Color;

public class kom {
	static double d_tar_ot, d_tar_vsn, d_tar_te, d_tar_vot, d_tar_g, d_tar_el, d_norm_hv, d_norm_gv, 
	d_norm_vot, d_norm_g, d_norm_el,d_vot_rash,d_hv_rash,d_g_rash,d_gv_rash,
	d_ot_rash,d_el_rash,d_s, d_kol, d_res_vot,d_res_hv,d_res_g,d_res_gv,d_res_ot,d_res_el,d_sum;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

	public static void calcul(){/*Класс gettext, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		/*Записываем тарифы и нормативы в переменные*/
		d_tar_ot = Double.parseDouble(vkl_1.tar_ot.getText().replace(',','.'));
		d_tar_vsn = Double.parseDouble(vkl_1.tar_vsn.getText().replace(',','.'));
		d_tar_te = Double.parseDouble(vkl_1.tar_te.getText().replace(',','.'));
		d_tar_vot = Double.parseDouble(vkl_1.tar_vot.getText().replace(',','.'));
		d_tar_g = Double.parseDouble(vkl_1.tar_g.getText().replace(',','.'));
		d_tar_el = Double.parseDouble(vkl_1.tar_el.getText().replace(',','.'));
		d_norm_hv = Double.parseDouble(vkl_1.norm_hv.getText().replace(',','.'));
		d_norm_gv = Double.parseDouble(vkl_1.norm_gv.getText().replace(',','.'));
		d_norm_vot = Double.parseDouble(vkl_1.norm_vot.getText().replace(',','.'));
		d_norm_g = Double.parseDouble(vkl_1.norm_g.getText().replace(',','.'));
		d_norm_el = Double.parseDouble(vkl_1.norm_el.getText().replace(',','.'));
		d_s = Double.parseDouble(vkl_2.s.getText().replace(',','.'));
		d_kol = Double.parseDouble(vkl_2.kol.getText().replace(',','.'));
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
		Преобразование данных в тип Double. replace - изменить запятую на точку (необходимо для расчетов) */
		
		/*ВОДООТВЕДЕНИЕ*/
		if (vkl_2.int_vot_s==1){
			d_vot_rash = Double.parseDouble(vkl_2.vot_rash.getText().replace(',','.'));
			d_res_vot = d_vot_rash*d_tar_vot;
			} 
		if (vkl_2.int_vot_norm==1){
			d_vot_rash=d_norm_vot;
				d_res_vot = d_vot_rash*d_tar_vot*d_kol;
			}
		/*ХОЛОДНОЕ ВОДОСНАБЖЕНИЕ*/
		if (vkl_2.int_hv_s==1){
			d_hv_rash = Double.parseDouble(vkl_2.hv_rash.getText().replace(',','.'));
			d_res_hv = d_hv_rash*d_tar_vsn;
			} 
		if (vkl_2.int_hv_norm==1){
			d_hv_rash=d_norm_hv;
				d_res_hv =d_hv_rash *d_tar_vsn*d_kol;
			}
		/*ГАЗОСНАБЖЕНИЕ*/
		if (vkl_2.int_g_s==1){
			d_g_rash = Double.parseDouble(vkl_2.g_rash.getText().replace(',','.'));
			d_res_g = d_g_rash*d_tar_g;
			}
		if (vkl_2.int_g_norm==1){
			d_g_rash=d_norm_g;
				d_res_g = d_g_rash*d_tar_g*d_kol;
			}
		/*ГОРЯЧЕЕ ВОДОСНАБЖЕНИЕ*/
		if (vkl_2.int_gv_s==1){
			d_gv_rash = Double.parseDouble(vkl_2.gv_rash.getText().replace(',','.'));
			d_res_gv = d_gv_rash*d_tar_te;
			}
		if (vkl_2.int_gv_norm==1){
			d_gv_rash=d_norm_gv;
				d_res_gv = d_gv_rash*d_tar_te*d_kol;
			}
		/*ОТОПЛЕНИЕ*/
		if (vkl_2.int_ot_norm==1){
		d_res_ot = d_tar_ot*d_s;
		}
		/*ЭЛЕТРОСНАБЖЕНИЕ*/
		if (vkl_2.int_el_s==1){
			d_el_rash = Double.parseDouble(vkl_2.el_rash.getText().replace(',','.'));
			d_res_el = d_el_rash*d_tar_el;
			} 
		if (vkl_2.int_el_norm==1){
			d_el_rash=d_norm_el;
				d_res_el = d_el_rash*d_tar_el*d_kol;
			}
		d_sum=d_res_vot+d_res_hv+d_res_g+d_res_gv+d_res_ot+d_res_el;
		

	    /* String - указываем что переменная будет иметь строковый тип,
	     * res_el - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	d_res_el - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		if (d_res_vot!=0){
		    String res_vot = String.format("%.2f", d_res_vot);//форматированный вывод "%f%n"
		    String vot_rash = String.format("%.3f", d_vot_rash);//форматированный вывод "%f%n"
		    String tar_vot = String.format("%.3f", d_tar_vot);//форматированный вывод "%f%n"
		    vkl_2.label_vot.setText(res_vot);
		    vkl_2.vot_rash.setText(vot_rash);
		    vkl_2.vot_t.setText(tar_vot);
			vkl_2.label_4.setForeground(Color.BLACK); 
			vkl_2.label_5.setForeground(Color.BLACK); 
			vkl_2.vot_rash.setEditable(true);
			vkl_2.vot_t.setEditable(true);
		}
		if (d_res_hv!=0){
		    String res_hv = String.format("%.2f", d_res_hv);//форматированный вывод "%f%n"
		    String hv_rash = String.format("%.3f", d_hv_rash);//форматированный вывод "%f%n"
		    String tar_hv = String.format("%.3f", d_tar_vsn);//форматированный вывод "%f%n"
		    vkl_2.label_hv.setText(res_hv);
		    vkl_2.hv_rash.setText(hv_rash);
		    vkl_2.hv_t.setText(tar_hv);
			vkl_2.label_7.setForeground(Color.BLACK); 
			vkl_2.label_8.setForeground(Color.BLACK); 
			vkl_2.hv_rash.setEditable(true);
			vkl_2.hv_t.setEditable(true);
		}
		if (d_res_g!=0){
		    String res_g = String.format("%.2f", d_res_g);//форматированный вывод "%f%n"
		    String g_rash = String.format("%.3f", d_g_rash);//форматированный вывод "%f%n"
		    String tar_g = String.format("%.3f", d_tar_g);//форматированный вывод "%f%n"
		    vkl_2.label_g.setText(res_g);
		    vkl_2.g_rash.setText(g_rash);
		    vkl_2.g_t.setText(tar_g);
			vkl_2.label_10.setForeground(Color.BLACK); 
			vkl_2.label_11.setForeground(Color.BLACK); 
			vkl_2.g_rash.setEditable(true);
			vkl_2.g_t.setEditable(true);
		}
		if (d_res_gv!=0){
		    String res_gv = String.format("%.2f", d_res_gv);//форматированный вывод "%f%n"
		    String gv_rash = String.format("%.3f", d_gv_rash);//форматированный вывод "%f%n"
		    String tar_gv = String.format("%.3f", d_tar_te);//форматированный вывод "%f%n"
		    vkl_2.label_gv.setText(res_gv);
		    vkl_2.gv_rash.setText(gv_rash);
		    vkl_2.gv_t.setText(tar_gv);
			vkl_2.label_13.setForeground(Color.BLACK); 
			vkl_2.label_14.setForeground(Color.BLACK); 
			vkl_2.gv_rash.setEditable(true);
			vkl_2.gv_t.setEditable(true);
		}	
		if (d_res_ot!=0){
		    String res_ot = String.format("%.2f", d_res_ot);//форматированный вывод "%f%n"
		    String tar_ot = String.format("%.3f", d_tar_ot);//форматированный вывод "%f%n"
		    vkl_2.label_ot.setText(res_ot);
		    vkl_2.ot_t.setText(tar_ot);
			vkl_2.label_17.setForeground(Color.BLACK); 
			vkl_2.ot_t.setEditable(true);
		}	
		if (d_res_el!=0){
		    String res_el = String.format("%.2f", d_res_el);//форматированный вывод "%f%n"
		    String el_rash = String.format("%.3f", d_el_rash);//форматированный вывод "%f%n"
		    String tar_el = String.format("%.3f", d_tar_el);//форматированный вывод "%f%n"
		    vkl_2.label_el.setText(res_el);
		    vkl_2.el_rash.setText(el_rash);
		    vkl_2.el_t.setText(tar_el);
			vkl_2.label_19.setForeground(Color.BLACK); 
			vkl_2.label_20.setForeground(Color.BLACK); 
			vkl_2.el_rash.setEditable(true);
			vkl_2.el_t.setEditable(true);
		}	

	    String res_sum = String.format("%.2f", d_sum);//форматированный вывод "%f%n"
	    /* String - указываем что переменная будет иметь строковый тип,
	     * res_el - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	d_res_el - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		
	    vkl_2.label_itogo.setText(res_sum); 
	    /* Записываем строковые переменные в текстовые поля label_itogo.., которые расположены в файле vkl_2 */

	}
}
