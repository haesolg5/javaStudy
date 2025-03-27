package ex15usefulclass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class E05Date {
	
	/*
	Calender 클래스를 통해 얻은 인스턴스를 초(sec)로 변홚나 후
	매개변수로 전달된 날짜서식으로 변환한 문자열을 반환한다. */
	public static String myDateFormat(Calendar c, 
			String formatStr) {
		/*
		서버의 표준시인 1970-01-01 부터 현재까지의 시간을 초 단위로 
		변환해주는 메서드로 이를 '타임스탬프'라고 한다. */
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}
	public static void main(String[] args) {
		/*
		Claender 클래스는 java의 대표적인 싱글톤 객체이므로
		new를 사용하는 대신 유틸리티 메서드인 getInstance()를
		통해 참조값을 얻어온다. */
		Calendar calendar = Calendar.getInstance();
		/*
		월을 표현하는 Month, 분을 표현하는 Minute의 첫 글자가
		동일하므로 구분을 위해 월은 ㄷ재문자, 분을 소문자를 사용한다. */
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1:"+ nowStr1);
		//그 외 여러가지 서식문자가 존재함
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째 주, d번째 날, F번째 E요일");
		System.out.println("현재2:"+ nowStr2);
		
		/*
		현재 날짜르 ㄹ기중으로 과거/미래를 구하기 위해 add메서드를
		사용한다. 두번째 인수가 음수면 과거의 날짜를 구할 수 있다. */
		calendar.add(Calendar.DATE, 3); //3일 후
		calendar.add(Calendar.MONTH, 2); //2개월 후
		calendar.add(Calendar.YEAR, 1); //내년(1년후)_
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년 2개월 3일 후:"+ nowStr3);
		/* 앞에서 add를 3번 호출했으므로 결과는 아래와 같이 1년
		2개월 3일 후의 날짜가 출력된다. */
		
		/*
		올해 크리스마스까지 남은 날짜를 계산. 여기서는 두 가지 서식의 날짜를
		파싱(추출...뽑아내는......)하여 구한 날짜 인스턴스로 계산한다. */
		//오늘날짜 : 0000-00-00 형식
		String today = new SimpleDateFormat("yyyy-MM-dd")
				.format(new Date());
		//크리스마스 : 0000/00/00 형식
		String future = "2025/12/25";
		//
		long result = myDiffDate(today, future);
		System.out.println(today+ "에서 "+ future +"까지 남은 날짜:"+ result);
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			/*
			매개변수를 통해 전달된 2개의 문자열은 날짜으시 서식이 서로 다르다.
			따라서 각 날짜의 서식을 명확히 지정해야만
			날짜를 인식하여 연산할 수 있다. */
			//각 서식의 날짜를 파싱해서 Date 인스턴스로 변환한다.
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatfuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			//
			
			/*
			getTime()으로 얻어오는 시간은 13자리의 정수값이다.
			10자리까지는 순수한 포(sec)이고, 11~13자리는 밀리세컨즈를 의미한다.
			즉 100으로 나눈 후 뒤의 3자리를 제거하면 순수한 초가 반환된다.
			또한 하루는 50*60*24 즉 86400초 이므로 아래와 같이 남은 날짜를 계산할 수 있다. */
			diffDays = (formatfuture.getTime() - formatToday.getTime())
					/ (24*60*60*1000);
		}
		catch (Exception e) {}
		return diffDays;
	}

}
