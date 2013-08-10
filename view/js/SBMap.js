SBMap = OpenLayers.Class(OpenLayers.Map, {

    initialize : function(targetDiv) {
        OpenLayers.Map.prototype.initialize.apply(this, [
                targetDiv,
                {
                    controls : [ new OpenLayers.Control.Attribution(),
                            new OpenLayers.Control.Navigation({
                                dragPanOptions : {
                                    enableKinetic : true
                                }
                            }), new OpenLayers.Control.Zoom() ],
                    projection : new OpenLayers.Projection("EPSG:900913"),
                    numZoomLevels : 18
                } ]);
    }
});