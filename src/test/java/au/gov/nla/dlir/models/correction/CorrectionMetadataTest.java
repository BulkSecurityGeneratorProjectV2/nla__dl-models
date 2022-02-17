package au.gov.nla.dlir.models.correction;

import org.junit.Assert;
import org.junit.Test;

public class CorrectionMetadataTest {

  private final CorrectionMetadata correctionMetadata = new CorrectionMetadata();

  @Test
  public void getCleanNullOldLines() {
    Assert.assertNull(correctionMetadata.getCleanOldLines());
  }

  @Test
  public void getCleanOldLines() {
    correctionMetadata.setOldLines("[0,0]TTTTTTT @@||@@[0,0]HONORARY EXECUTIVE COMMITTEE: @@||@@");
    Assert.assertEquals(
        "TTTTTTT \nHONORARY EXECUTIVE COMMITTEE: \n", correctionMetadata.getCleanOldLines());
  }

  @Test
  public void testNullUserDisplayName() {
    String displayName = correctionMetadata.getUserDisplay();

    Assert.assertNotNull(displayName);
    Assert.assertEquals(0, displayName.length());
  }
}
