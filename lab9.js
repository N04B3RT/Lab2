$(document).ready(function() {
    // Filter functionality
    $('.filter-btn').on('click', function() {
        var filterValue = $(this).attr('data-filter');
        if (filterValue == 'all') {
            $('.gallery-item').show();
        } else {
            $('.gallery-item').hide();
            $('.' + filterValue).show();
        }
    });

    // Lightbox functionality
    $('.gallery-item img').on('click', function() {
        var imgSrc = $(this).attr('src');
        $('.lightbox-image').attr('src', imgSrc);
        $('.lightbox').fadeIn();
    });

    $('.close, .lightbox').on('click', function() {
        $('.lightbox').fadeOut();
    });

    $('.lightbox-content').on('click', function(e) {
        e.stopPropagation();
    });
});
