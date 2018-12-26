/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author architgarg
 */
import java.util.*;
public class BTM {
    public static void main(String args[]) {
        Map<Long, Integer> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = 6;
        long[] timestamp = {1472568095, 1472620192, 1472630264, 1472635488, 1472641430, 1472635488};
        int people[] = {59, 50, 5, 59, 60, 2};
        int currPeople = 0;
        String status[] = {"E", "X", "X", "E", "X", "X"};
        for (int i = 0; i < n; i++) {
            if (status[i].equals("E")) {
                currPeople += people[i];
                if (tm.containsKey(timestamp[i])) {
                    int val = tm.get(timestamp[i]);
                    val += currPeople;
                    tm.put(timestamp[i], val);
                }
                else {
                    tm.put(timestamp[i], currPeople);
                }
            }
            else {
                currPeople -= people[i];
                if (tm.containsKey(timestamp[i])) {
                    int val = tm.get(timestamp[i]);
                    val -= currPeople;
                    tm.put(timestamp[i], val);
                }
                else {
                    tm.put(timestamp[i], currPeople);
                }
            }
        }
        int maxPeople = 0;
        long maxTimeStamp = 0;
        long secTimeStamp = 0;
       int f = 0;
        for (Map.Entry<Long, Integer> entry : tm.entrySet()) {
            if (f == 1) {
                secTimeStamp = entry.getKey();
                f = 0;
            }
            if (entry.getValue() > maxPeople) {
                maxPeople = entry.getValue();
                maxTimeStamp = entry.getKey();
                f = 1;
            }
        }
        //System.out.println(maxTimeStamp);
       /* for (Map.Entry<Long, Integer> entry : tm.entrySet()) {
            if (f == 1) {
                
            }
            if (entry.getKey() == maxTimeStamp) {
                f = 1;
            }
        }*/
       System.out.println("" + maxTimeStamp + " " + secTimeStamp);
    }
}
