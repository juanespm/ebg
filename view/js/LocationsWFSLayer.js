function getUrlVars() {
    var vars = {};
    var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi,
            function(m, key, value) {
                vars[key] = value;
            });
    return vars;
}

LocationsWFSLayer = OpenLayers.Class(OpenLayers.Layer.Vector, {
    baseUrl : "http://" + document.domain
            + "/cgi-bin/mapserv?MAP=/srv/www/htdocs/flyersmaps/flyers.map",

    locationId : getUrlVars()["id"],

    getLocationUrl : function() {
        return this.baseUrl + "&ID=" + this.locationId;
    },

    initialize : function(name, style) {

        OpenLayers.Layer.Vector.prototype.initialize.apply(this, [ name, {
            styleMap : new OpenLayers.StyleMap({
                'default' : style
            }),
            renderers : [ "Canvas", "SVG", "VML" ],
            transitionEffect : 'resize',
            strategies : [ new OpenLayers.Strategy.Fixed() ],
            protocol : new OpenLayers.Protocol.WFS({
                version : "1.0.0",
                srsName : "EPSG:900913",
                url : this.getLocationUrl(),
                featureType : "Locations",
                featureNS : "http://swissbytes.ch/mapserv",
                featurePrefix : "sb",
                geometryName : "msGeometry"
            })
        } ]);
        
        this.events.register("featuresadded", this, function() {
            var bounds = this.getDataExtent();
            if(bounds){ this.map.panTo(bounds.getCenterLonLat()); }
        });

    },

    updateLocationId : function(id) {
        this.locationId = id;
        this.refresh({
            url : this.getLocationUrl()
        });
    }
});
