SBTouchMap = OpenLayers.Class(OpenLayers.Map, {

    initialize : function(targetDiv) {
        OpenLayers.Map.prototype.initialize.apply(this, [
                targetDiv,
                {
                    controls : [ new OpenLayers.Control.Attribution(),
                            new OpenLayers.Control.Zoom(),
                            new OpenLayers.Control.TouchNavigation({
                                dragPanOptions : {
                                    enableKinetic : true
                                }
                            }) ],
                    projection : new OpenLayers.Projection("EPSG:900913"),
                    numZoomLevels : 18
                } ]);
    }
});