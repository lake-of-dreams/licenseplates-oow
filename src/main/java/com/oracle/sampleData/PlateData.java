
// ------------------------------------------------------------------------
// -- DISCLAIMER:
// --    This script is provided for educational purposes only. It is NOT
// --    supported by Oracle World Wide Technical Support.
// --    The script has been tested and appears to work as intended.
// --    You should always run new scripts on a test instance initially.
// --
// ------------------------------------------------------------------------

package com.oracle.sampleData;

import com.oracle.model.Plate;

public class PlateData {

  private Plate plate;

  public PlateData() {
  }

  public PlateData setPlate(Plate plate) {
    this.plate = plate;
    return this;
  }

  public Plate getPlate() {
    return plate;
  }

}
