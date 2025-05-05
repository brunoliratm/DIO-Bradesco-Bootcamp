public class Cell {
  private int value;
  private boolean isFixed;

  public Cell(int value, boolean isFixed) {
      this.value = value;
      this.isFixed = isFixed;
  }

  public int getValue() {
      return value;
  }

  public void setValue(int value) {
      if (!isFixed && value >= 0 && value <= 9) {
          this.value = value;
      }
  }

  public boolean isFixed() {
      return isFixed;
  }

  @Override
  public String toString() {
      return value == 0 ? "." : String.valueOf(value);
  }
}
