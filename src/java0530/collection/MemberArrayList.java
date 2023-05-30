package java0530.collection;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList = null;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i< arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member.getMemberName() + "회원님의 아이디는 " + member.getMemberId()+"입니다");
        }
        System.out.println();
    }

}
