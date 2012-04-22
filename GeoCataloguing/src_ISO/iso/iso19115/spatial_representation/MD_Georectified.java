/* Generated by Together */

package iso.iso19115.spatial_representation;

import iso.GM_Point;

/**
 * @author Luiz Andr�
 * @version 1.0
 * @since 1.0
 * @alias MD_Georectified
 * @stereotype ISO19115*/
public class MD_Georectified extends MD_GridSpatialRepresentation {
	/**
	 * 
	 */
	private static final long serialVersionUID = -895011583148666284L;

	public boolean checkPointAvailability = true;

	public String checkPointDescription = null;

	/**
	 * @supplierRole +cornerPoints*/
	public GM_Point[] cornerPoints = null;

	/**
	 * @supplierRole +cornerPoint*/
	public GM_Point centerPoint = null;
	public MD_PixelOrientationCode pointInPixel = null;

	public String transformationDimensionDescription = null;

	public String transformationDimensionMapping = null;

}
