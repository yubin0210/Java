package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	// Don't try this at home
	public static void main(String[] args) throws IOException {
		// 자바의 입력 단계
		
		// 1) 키보드 입력 글자의 코드를 정수형태로 입력받기
		
		int code = 0;
		System.out.print("글자 하나 입력 (1바이트) : ");
		code = System.in.read();
		System.out.println("code : " + code);
		System.out.println();
		
		System.in.read();	// 버퍼에 있는 1바이트 글자를 가져와서 저장하지 않고 버린다
		System.in.read();	// 가져왔지만 변수에 대입하지 않았으니 값은 사라진다
		
		// 2) 1바이트 기본 입력기를 기반으로 2바이트 단위 입력기 만들기
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("글자 하나 입력 (2바이트) : ");
		code = isr.read();
		System.out.println("code : " + code);
		System.out.println();
		
		// 3) 문자열(여러글자) 단위로 입력받는 입력기를 생성한다
		// 아까 사용했던 2바이트 입력기를 기반으로 생성한다
		BufferedReader br = new BufferedReader(isr);
		br.readLine();	// 버퍼에 남아있는 내용을 줄바꿈문자까지 가져온다
		System.out.print("문장을 입력하세요 : ");
		String s1 = br.readLine();
		System.out.println("s1 : " + s1);
		
		
		
		
		
		
		
	}
}
