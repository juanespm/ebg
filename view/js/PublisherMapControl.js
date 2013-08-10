var sbMap, osmLayer, marksLayer, blocksLayer, pavilionsLayer;
var myLocation;
var geolocator;

$jq = jQuery.noConflict();
$jq.ajaxSetup({
    cache : false
});

function init() {
     Richfaces.showModalPanel("wait");
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(initMap);
    } else {
        $jq("#map").html(
                "<em>Geolocation is not supported by this browser.</em>");
        Richfaces.hideModalPanel("wait");
    }
}

function initMap(location) {
    
    sbMap = new SBMap("map");

    osmLayer = new OSMapsLayer("OpenStreetMaps");
    blocksLayer = new BlocksWFSLayer("Manzanas", new BlockStyle());
    pavilionsLayer = new PavilionsWFSLayer("Pabellones", new PavilionStyle());
    marksLayer = new OpenLayers.Layer.Vector('Marks', {
        projection : sbMap.displayProjection,
        styleMap : new OpenLayers.StyleMap({ 'default' : new StandIconStyle() })
    });

    sbMap.addLayers([ osmLayer, blocksLayer, pavilionsLayer, marksLayer ]);

    var mapCenter = new OpenLayers.LonLat(-7036197.131704919971526, -2012345.402043776353821);
    
    sbMap.setCenter(mapCenter, 15);
    
    hideWaitPanel();
    
    var click = new ClickHandler(alertPosition, sbMap);
    sbMap.addControl(click);
    click.activate();
    
//    $jq('map').observe('mouseover', function() {
//        document.body.style.cursor = mousePointerStyle;
//    });
}

function hideWaitPanel() {
     Richfaces.hideModalPanel("wait");
}

function alertPosition(lon, lat) {
    alert("Position: " + lon + ", " + lat);
    
    // create a point and set it on the marks layer
    var publisherLocation = new OpenLayers.Geometry.Point(lon, lat);    
    marksLayer.removeAllFeatures();
    marksLayer.addFeatures([ new OpenLayers.Feature.Vector(publisherLocation, {}) ]);
}