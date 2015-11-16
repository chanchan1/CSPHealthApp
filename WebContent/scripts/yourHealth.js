/**
 * Health Web Application Dozent: Dr. Christoph Peylo Teilnehmer: Sarah
 * Schuchardt, Alexander Schmitz, Sebastian Dittrich
 * =========================================================================
 * created with Eclipse JEE running with Java 1.8, powered by Apache Tomcat 8
 * 
 */
function add_event_handler(){
	$('#chart_tab a').click(function (e) {
		e.preventDefault();
		draw_chart($(this).text());
		$(this).tab('show');
	})

}

$( document ).ready(function(){
	
	$('#HealthDataTable td.decimal').each(function () {
	    // action to perform.  Use $(this) for changing each cell
		float = parseFloat($(this).text()).toFixed(2);
		$(this).text(float);
	});
	
})
