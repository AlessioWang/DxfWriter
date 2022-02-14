package dxfWriter;

import dxfExporter.Constants;
import wblut.geom.WB_Point;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Alessio
 * @date 2021/6/16
 **/
public class Demo {

    DxfOP op;
    String path = "/c:/Users/Alessio/Desktop/cadDemo/demo6-25.dxf";

    public static void main(String[] args) {
        new Demo();
    }

    public Demo() {
        op = new DxfOP();
        test();
        op.save(path);
    }

    private void test() {
        op.createLayer("line3D", Constants.DXF_BLUE);
        op.createLine3D(new WB_Point(30, 50, 20), new WB_Point(50, 20, 50), "line3D");

        op.createLayer("line2D", Constants.DXF_AQUA);
        op.createLine2D(new WB_Point(0, 0, 0), new WB_Point(10, 30, 0), "line2D");

        op.createLayer("circle", Constants.DXF_GREEN);
        op.createCircle(new WB_Point(-30, -50, 20),350, "circle");

        List<WB_Point> pts = new ArrayList<>();
        pts.add(new WB_Point(10,20,0));
        pts.add(new WB_Point(30,50,60));
        pts.add(new WB_Point(20,90,0));
        pts.add(new WB_Point(130,20,0));

        op.createLayer("polyline",Constants.DXF_FUCHSIA);
        op.createPolyLine(pts,"polyline");

        op.createLayer("polygon",Constants.DXF_LIME);
        op.createPolygon(pts,"polygon");

        op.createLayer("hatch",Constants.DXF_MAROON);
        op.createHatch(pts,"hatch");

        op.createLayer("text",Constants.DXF_LIME);
        op.createText(new WB_Point(20,30,40),"Inst.AAA",20, 90,"text");
    }

}
