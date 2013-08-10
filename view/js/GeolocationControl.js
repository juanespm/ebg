GeolocationControl = OpenLayers.Class(OpenLayers.Control.Geolocate, {
//    style : null,
    layer : null,
    firstTime : true,

    initialize : function(name, vectorLayer, markerStyle, callback) {
//        this.style = markerStyle;
        this.layer = vectorLayer; 

        OpenLayers.Control.Geolocate.prototype.initialize.apply(this, [ {
            bind : true,
            watch : true,
            
            geolocationOptions : {
                enableHighAccuracy : true,
                maximumAge : 0,
                timeout : 7000
            }
        } ]);
        
        this.events.register("locationupdated", this, function(e) {
            
            this.layer.removeAllFeatures();
            this.layer.addFeatures([ new OpenLayers.Feature.Vector(e.point, {}) ]);
            
            
            if (this.firstTime) {
                this.firstTime = false;
                this.bind = false;
                callback();
            }
        });
    }
});