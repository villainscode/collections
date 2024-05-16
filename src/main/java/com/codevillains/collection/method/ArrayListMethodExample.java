package com.codevillains.collection.method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethodExample {
    public static void main(String[] args) {
        // List 인터페이스를 ArrayList 구현 클래스로 사용
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("최초 list: " + list);

        // 요소 삽입
        list.add(1, "Orange");
        System.out.println("요소 삽입 인덱스 1,  'Orange' : " + list);

        // 컬렉션 추가
        List<String> additionalFruits = new ArrayList<>();
        additionalFruits.add("Grape");
        additionalFruits.add("Watermelon");
        list.addAll(additionalFruits);
        System.out.println("collection 추가 : " + list);

        System.out.println("2번째 요소 가져오기 : " + list.get(2));

        // 요소 수정
        list.set(2, "Grapes");
        System.out.println("2번째 요소 변경 : " + list);

        // 요소 삭제 (인덱스로)
        String removedElement = list.remove(3);
        System.out.println("3번째 요소 삭제: " + removedElement);
        System.out.println("3번째 요소 삭제 후 collection: " + list);

        // 요소 삭제 (객체로)
        boolean isRemoved = list.remove("Banana");
        System.out.println("바나나 삭제 여부: " + isRemoved);
        System.out.println("바나나 삭제 후 collection: " + list);

        // 리스트 크기
        System.out.println("List 사이즈: " + list.size());

        // 리스트 비어 있는지 확인
        System.out.println("리스트가 비어있는지 확인? " + list.isEmpty());

        // 요소 포함 여부 확인
        boolean containsApple = list.contains("Apple");
        System.out.println("사과과 포함되어 있나? " + containsApple);

        // 리스트 반복
        System.out.println("list iterating :");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 리스트 반복자 사용
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("list 반복자 사용 :");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 하위 리스트 가져오기
        List<String> subList = list.subList(1, 3);
        System.out.println("SubList index 1부터 3까지: " + subList);

        // 리스트 초기화
        list.clear();
        System.out.println("list 초기화: " + list);
        System.out.println("리스트가 비어있나? " + list.isEmpty());
    }
}
