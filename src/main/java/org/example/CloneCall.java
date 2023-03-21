package org.example;

public class CloneCall implements Cloneable {
  private int x1;
  private int y1;
    public CloneCall(int a, int b) {
                x1 = a;
                y1 = b;
            }
            public Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
            public boolean equals(int x, int y) {
                return (x1 == x) && (y1 == y);
            }

        }
