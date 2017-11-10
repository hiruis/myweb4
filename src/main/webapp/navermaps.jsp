<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="map" style="width:100%;height:400px;"></div>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=h8WStogCDUynVUNDduy5&submodules=geocoder"></script>
<script>

// 지도 생성과 컨트롤 배치 시작
$(window).on('load', function() {
		var newSize = new naver.maps.Size($(window).width(), $(window).height());

		map.setSize(newSize);
});
var mapOptions = {
		mapTypeId: naver.maps.MapTypeId.TERRAIN,
		//tileSize: new naver.maps.Size(50, 128),
		center: new naver.maps.LatLng(37.500742,127.036925),			
		zoom:10,
		
		logoControl: false,
		mapDataControl: false,
				
};
var map = new naver.maps.Map('map', mapOptions);

var allmountain = [
				[001,'역삼1호점',37.500742,127.036925],[004,'강남1호점',37.498090,127.029523],
				[002,'역삼2호점',37.500163,127.036845],[005,'강남2호점',37.497331,127.028775],
				[003,'역삼3호점',37.500074,127.038073],[006,'강남3호점',37.499013,127.029181]
				];
				
var marker = [];
var infoWindows = [];
var allmountaintotal = allmountain.length - 1;

for (i = 0; i <= allmountaintotal; i++) {
	var markerOptions = {
        title : allmountain[i][1],
		position: new naver.maps.LatLng(allmountain[i][2], allmountain[i][3]),
		map: map,
		//아이콘 사용
/*  		icon: {
			url: 'http://cfs.tistory.com/custom/blog/19/191630/skin/images/flag_red48.png',
			size: new naver.maps.Size(48, 48),
			origin: new naver.maps.Point(0, 0),
			anchor: new naver.maps.Point(08, 48)
		}  */
	 
	};

	marker[i] = new naver.maps.Marker(markerOptions);
	// 깃발(마커) 정보창 내용과 디자인 시작
	var contentString = [
    '<div class="iw_inner">',
	'   <h3 style="text-align:center;">'+ allmountain[i][0] +'</h3>',
    '   <p style="text-align:center;">( '+ allmountain[i][1] +')</p>',
    '   <p>이미지 삽입 예정<br />',
	'   정상좌표 : '+ allmountain[i][2] +', '+allmountain[i][3]+'<br />',
    '   </p>',
    '</div>'
	].join('');

	var infoWindow = new naver.maps.InfoWindow({
		content: contentString,
		maxWidth: 300,
		backgroundColor: "#eee",
		borderColor: "#000000",
		borderWidth: 3,
		anchorSize: new naver.maps.Size(8, 8),
		anchorSkew: false,
		anchorColor: "#eee",
		pixelOffset: new naver.maps.Point(0, 0)
	});	
	// 깃발(마커) 정보창 내용과 디자인 끝
	
	infoWindows.push(infoWindow);	
}
// 해당 마커의 인덱스를 seq라는 클로저 변수로 저장하는 이벤트 핸들러를 반환합니다.
function getClickHandler(seq) {
	return function(e) {
		var markertmp = marker[seq],
		// var markertmp = markers[seq],
			infoWindow = infoWindows[seq];

		if (infoWindow.getMap()) {
			infoWindow.close();
		} else {
			infoWindow.open(map, markertmp);
		}
	}
}

for (var i=0, ii=marker.length; i<ii; i++) {
	naver.maps.Event.addListener(marker[i], 'click', getClickHandler(i));
}	
// 정보창 호출과 닫기 기능 끝

// 지도 생성과 컨트롤 배치 끝

</script>
</body>
</html>