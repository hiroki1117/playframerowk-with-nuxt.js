<template>
  <section>
    <h1 class="header">Hello world!</h1>
    <Sample :info="info"></Sample>
  </section>
</template>

<script lang="ts">
    import {
        Component,
        Vue
    } from "nuxt-property-decorator"
    import { State } from "vuex-class"
    import Sample from "~/components/Sample.vue"

    @Component({
        components: {
            Sample
        }
    })
    export default class extends Vue {
        @State info
    }
</script>
<style scoped>
  .header {
    color: blue;
  }
</style>