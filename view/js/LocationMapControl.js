var sbMap, osmLayer, blocksLayer, pavilionsLayer, locationsLayer;

$jq = jQuery.noConflict();
$jq.ajaxSetup({
    cache : false
});

function initMap() {
    Richfaces.showModalPanel("wait");

    sbMap = new SBMap("map");

    osmLayer = new OSMapsLayer("OpenStreetMaps");
    blocksLayer = new BlocksWFSLayer("Manzanas", new BlockStyle());
    pavilionsLayer = new PavilionsWFSLayer("Pabellones", new PavilionStyle());
    locationsLayer = new LocationsWFSLayer("Locations", new LocationIconStyle());

    sbMap.addLayers([ osmLayer, blocksLayer, pavilionsLayer, locationsLayer ]);

    var mapCenter = new OpenLayers.LonLat(-7036197.131704919971526,
            -2012345.402043776353821);

    // mapCenter.transform(new OpenLayers.Projection("EPSG:4326"),
    // new OpenLayers.Projection("EPSG:900913"));

    sbMap.setCenter(mapCenter, 15);

    Richfaces.hideModalPanel("wait");
}

function markLocation(id) {
    locationsLayer.updateLocationId(id);
}