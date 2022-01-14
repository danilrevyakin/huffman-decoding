package com.company;

public class Decoding {

    void decode(String s, Node root) {
        Node temp = root;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                temp = temp.left;
            else
                temp = temp.right;
            assert temp != null;
            if (temp.right == null && temp.left == null) {
                ans.append(temp.data);
                temp = root;
            }
        }
        System.out.println(ans);
    }
}
