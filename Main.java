import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] number = new int[100];
    int[] counter = new int[10];

    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] = rand.nextInt(10));
      // 0부터 9까지 자연수 100개 num배열에 담고, 랜덤 출력
    }
    System.out.println();

    for (int i = 0; i < number.length; i++) {
      counter[number[i]]++;
      // 0~9 수 빈도 체크
    }
    for (int i = 0; i < counter.length; i++) {
      System.out.println(i + "의 개수 :" + printGraph('#', counter[i]) + " " + counter[i]);
    }

  }

  public static String printGraph(char ch, int value) { // 매개변수로 바 모양, 바 길이 정수
    char[] bar = new char[value];

    for (int i = 0; i < bar.length; i++) {
      bar[i] = ch;
    }
    return new String(bar);
  }
}