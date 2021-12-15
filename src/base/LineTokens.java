package base;

import java.util.List;

public class LineTokens {
    public String first;
    public String second;
    public String third;
    public String fourth;
    public String fifth;
    public String sixth;

    public LineTokens(List<String> asList) {
        first = asList.get(0);
        second = asList.get(1);
        third = asList.get(2);
        fourth = asList.get(3);
        fifth = asList.get(4);
        sixth = asList.get(5);
    }

    public LineTokens() {

    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "LineTokens{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                ", fifth='" + fifth + '\'' +
                ", sixth='" + sixth + '\'' +
                "}\r\n";
    }
}