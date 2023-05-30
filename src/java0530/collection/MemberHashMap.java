package java0530.collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재지 않습니다");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member.getMemberName() + "회원님의 아이디는 " + member.getMemberId()+"입니다");
        }
    }
}
