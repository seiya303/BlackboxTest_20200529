
/**
 * 여기에 CalAdm 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class CalAdm
{
    int fee;
    public double calAdm(int age) {
        if (age == 4) {fee = 0;}
        else if (age < 4) {fee = 400;}
        else if (age <7) {fee = 900;}
        else {fee = 2000;}
        return fee;
    }
}
