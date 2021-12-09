/*
TNPG: CNN - Corina Chen + Binktop, Nicole Zhou + Duck, Nada Hameed + Ray
APCS PD 6
HW 45 - developing SuperArray even further with an interface
2021-12-09
time spent: 10 mins

DISCOS:
- in the interface, there are only abstract (empty) methods

QCCS:
- public v private?
*/

public interface ListInt {
  public int size();
  public int set(int index, int newVal); 
  public int get(int index ); 
  public void add(int newVal);
  public void add(int index, int newVal);
  public void remove(int index); 
}
