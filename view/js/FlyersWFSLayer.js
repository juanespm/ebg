function getUrlVars() {
    var vars = {};
    var parts = window.location.href.replace(
            /[?&]+([^=&]+)=([^&]*)/gi, 
            function(m,key,value) {
                vars[key] = value;
            });
    return vars;
}

FlyersWFSLayer = OpenLayers.Class(OpenLayers.Layer.Vector, {
    
    initialize: function(name, style) {
        var standId = getUrlVars()["id"];
        
        OpenLayers.Layer.Vector.prototype.initialize.apply(this, [name, {
            styleMap : new OpenLayers.StyleMap({ 'default' : style }),
            renderers : [ "Canvas", "SVG", "VML" ],
            transitionEffect : 'resize',
            strategies : [ new OpenLayers.Strategy.Fixed() ],
            protocol : new OpenLayers.Protocol.WFS(
                    {
                        version : "1.0.0",
                        srsName : "EPSG:900913",
                        url : "http://"
                                + document.domain
                                + "/cgi-bin/mapserv?MAP=/srv/www/htdocs/flyersmaps/flyers.map&ID=" + standId,
                        featureType : "Flyers",
                        featureNS : "http://swissbytes.ch/mapserv",
                        featurePrefix : "sb",
                        geometryName : "msGeometry"
                    })
        }]);
    }
});
