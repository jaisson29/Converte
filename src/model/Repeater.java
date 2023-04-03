package model;

import javax.swing.*;

public class Repeater {

  public boolean tryToRepeat() {
    int answer;
    answer = JOptionPane.showConfirmDialog(null, "Do you wanna continue?");
    if (answer != 0) {
      JOptionPane.showMessageDialog(null, "Program finished");
      return false;
    }
    return true;
  }
}