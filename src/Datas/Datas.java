package Datas;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas {
	public static void main(String[] args) {
		
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2020-04-23T13:51:07Z"));
		System.out.println(dt.format(d));
		
		//ADICIONANDO HORA, DIA, NO CALENDARIO
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 1); //ATRUBUINDO 1 HORA A MAIS
		d = cal.getTime(); //ATUALIZANDO A VARIAVEL 
		System.out.println(dt.format(d));
	}
	

}
