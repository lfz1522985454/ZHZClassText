/**
 * Created by songbai on 2018/5/24.
 */
(function() {
    var Radar = function(cfg) {
        var outContainer = document.querySelector(cfg.el);
        var container = document.createElement("div");
        var cans = document.createElement("canvas");
        container.appendChild(cans);
        outContainer.appendChild(container);

        var ctx = cans.getContext("2d");
        var data = cfg.data;
        var w = cfg.width;
        var h = cfg.height;
        container.style.position = "relative";
        container.style.width = w+"px";
        container.style.height = h+"px";
        cans.width = w;
        cans.height = h;

        var step = data.length;
        var r = w/2;

        //绘制网格背景
        var isBlue = false;

        for(var s = 10; s > 0; s--) {
            ctx.beginPath();
            for(var i=0;i<step;i++) {
                var rad = 2*Math.PI/step * i;
                var x = r + Math.sin(rad)*r*(s/10);
                var y = r + Math.cos(rad)*r*(s/10);
                ctx.lineTo(x, y);
            }
            ctx.closePath();
            ctx.fillStyle = (isBlue = !isBlue)?'#99c0ff' : '#f1f9ff';
            ctx.fill();
        }


        //绘制伞骨
        ctx.beginPath();
        for(var i=0;i<step;i++) {
            var rad = 2*Math.PI/step * i;
            var x = r + Math.sin(rad)*r;
            var y = r + Math.cos(rad)*r;
            ctx.moveTo(r,r);
            ctx.lineTo(x, y);

            var text = document.createElement("div");
            text.innerHTML = data[i][0];
            text.style.position = "absolute";
            text.style.width="30px";
            //添加文本
            if(x > r) {
                text.style.left = ( x + 15) + 'px';
            } else {
                text.style.right = (w-x +10) + 'px';
            }

            if(y > r) {
                text.style.top = y + 'px';
            } else {
                text.style.bottom = (h - y) + 'px';
            }
            container.appendChild(text);
        }
        ctx.strokeStyle = "#b7b7b7"
        ctx.stroke();

        //绘制折线
        ctx.strokeStyle = "#f00";
        ctx.beginPath();

        for(var i=0;i<step;i++) {
            var rad = 2*Math.PI/step * i;
            var x = r + Math.sin(rad)*r*data[i][1];
            var y = r + Math.cos(rad)*r*data[i][1];
            ctx.lineTo(x,y);
        }
        ctx.closePath();
        ctx.stroke();

        //添加数据点
        ctx.fillStyle = "#ff7676";
        for(var i=0;i<step;i++) {
            var rad = 2*Math.PI/step * i;
            var x = r + Math.sin(rad)*r*data[i][1];
            var y = r + Math.cos(rad)*r*data[i][1];
            ctx.beginPath();
            ctx.arc(x,y,4,0,2*Math.PI);
            ctx.fill();
            ctx.closePath();
        }


    }
    window["Radar"] = Radar;
})();