/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion11;


public interface Pair<K, V> {
    K getKey();
    V getValue();
    void setKey(K key);
    void setValue(V value);
}