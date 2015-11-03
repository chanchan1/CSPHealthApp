/**
 * Health Web Application Dozent: Dr. Christoph Peylo Teilnehmer: Sarah
 * Schuchardt, Alexander Schmitz, Sebastian Dittrich
 * =========================================================================
 * created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8
 * 
 */
function add_event_handler(){
	$('#chart_tab a').click(function (e) {
		e.preventDefault();
		draw_chart($(this).text());
		$(this).tab('show');
	})

}
