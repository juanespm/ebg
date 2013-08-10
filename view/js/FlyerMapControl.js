var sbMap, osmLayer, marksLayer, blocksLayer, pavilionsLayer, flyersLayer;
var geolocator;

$jq = jQuery.noConflict();
$jq.ajaxSetup({
    cache : false
});

function init() {
     Richfaces.showModalPanel("wait");
    if (navigator.geolocation) {
        initMap();
    } else {
        $jq("#map").html(
                "<em>Geolocation is not supported by this browser.</em>");
        Richfaces.hideModalPanel("wait");
    }
}

function initMap() {

    sbMap = new SBTouchMap("map");

    osmLayer = new OSMapsLayer("OpenStreetMaps");
    blocksLayer = new BlocksWFSLayer("Manzanas", new BlockStyle()); //blockStyle);
    pavilionsLayer = new PavilionsWFSLayer("Pabellones", new PavilionStyle()); //pavilionStyle);
    flyersLayer = new FlyersWFSLayer("Flyers", new FlyerIconStyle()); //standIcon);
    marksLayer = new OpenLayers.Layer.Vector('Marks', {
        projection : sbMap.displayProjection,
        styleMap : new OpenLayers.StyleMap({ 'default' : new AndroidIconStyle() /*androidIcon*/ })
    });

    sbMap.addLayers([ osmLayer, blocksLayer, pavilionsLayer, flyersLayer,
            marksLayer ]);

    
    var mapCenter = new OpenLayers.LonLat(-7036197.131704919971526, -2012345.402043776353821);

//    mapCenter.transform(new OpenLayers.Projection("EPSG:4326"),
//            new OpenLayers.Projection("EPSG:900913"));
    
    sbMap.setCenter(mapCenter, 15);

    this.geolocator = new GeolocationControl("Geolocator", marksLayer,
            new AndroidIconStyle(), hideWaitPanel);

    sbMap.addControl(this.geolocator);

    this.geolocator.activate();
}

function hideWaitPanel() {
     Richfaces.hideModalPanel("wait");
}