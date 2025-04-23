// favorites.js

/**
 * Toggle the `favorite` flag on a listing.
 * @param {string} docId   Firestore document ID
 * @param {boolean} currentValue   what .favorite is now
 */
function toggleFavorite(docId, currentValue) {
  // updateListingById is defined in index.html
  updateListingById(docId, { favorite: !currentValue });
}

// Ensure changing the "Show Favorites Only" box refreshes right away
document.addEventListener('DOMContentLoaded', () => {
  const cb = document.getElementById('filterFavoritesOnly');
  if (cb) cb.addEventListener('change', refreshTable);
});
